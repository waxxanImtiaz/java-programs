// calc.java - simple calculator language interpreter

// imports
import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;

// calcApplet
public class calcApplet extends Applet
{
    private calcPanel p;    // the interface panel

    public void init()
    {
        add( p = new calcPanel() );     // add a panel to the display
        show();                         // show the display
    }

    public void start()
    {
        p.enable();                     // enable the panel
    }

    public void stop()
    {
        p.disable();                    // disable the panel
    }
}

// calcPanel is a small panel class that implements a simple
// calculator language interpreter
class calcPanel extends Panel
{
    // input string
    private String inputString = null;
    private TextField inputTF;
    private TextArea outputTA;
    private Button calculateB;
    private Button clearB;

    // constructor function
    calcPanel()
    {
        // draw the interface
        Panel northP = new Panel();     // input
        Panel centerP = new Panel();    // controls
        Panel southP = new Panel();     // output

        // input panel
        northP.setLayout( new BorderLayout() );
        northP.add( "North", new Label("Input Expression:") );
        northP.add( "Center", inputTF = new TextField(60) );

        // controls panel
        centerP.add( calculateB = new Button("Calculate") );
        centerP.add( clearB = new Button("Clear") );

        // output panel
        southP.setLayout( new BorderLayout() );
        southP.add( "North", new Label("Output:") );
        southP.add( "Center", outputTA = new TextArea(3,60) );
        outputTA.setEditable( false );
        outputTA.setFont( new Font( "Courier", Font.PLAIN, 12 ) );

        // add all the panels
        setLayout( new BorderLayout() );
        add( "North", northP );
        add( "Center", centerP );
        add( "South", southP );

        return;
    }

    // handle the user actions
    public boolean action( Event ev, Object arg )
    {
        if (ev.target instanceof Button)
        {
            if ("Calculate".equals(arg))
                process();
            else if ("Clear".equals(arg))
                clear();
            return true;
        }
        return false;
    }

    // process the input string
    protected void process()
    {
        // get the input string
        inputString = inputTF.getText();

        // trim the string
        inputString = inputString.trim();

        // ensure there are characters to process
        if (inputString.length() > 0)
            // check syntax, evaluate and display results if correct
            if ( checkSyntax() )
                outputTA.setText( " = " + evaluate() );
    }

    // checkSyntax checks the syntax of the input string, calls reportError
    // to report any errors.  Returns true if the string is part of the
    // grammar, false if an error was found.
    protected boolean checkSyntax()
    {
        int opCount = 1;        // start with a value
        boolean hasDec = false; // does the current # have a decimal component?
        int i;

        // check each character
        for (i = 0; i < inputString.length(); i++)
            switch(inputString.charAt(i))
            {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    opCount = 0;
                    break;
                case '.':
                    if (((opCount += 2) > 2) || hasDec)
                        return reportError(i);
                    hasDec = true;
                    break;
                case '/':
                case '*':
                    if (opCount++ > 0)
                        return reportError(i);
                    hasDec = false;
                    break;
                case '+':
                case '-':
                    if (opCount++ > 1)
                        return reportError(i);
                    hasDec = false;
                    break;
                default:
                    return reportError(i);
            }

        // make sure expression ends with a value
        if (opCount > 0)
            return reportError(i);
        else
            return true;
    }

    // evaluate - returns the value obtained by evaluating the input expression
    protected double evaluate()
    {
        // temp token handle
        String tok1, tok2;

        // create a string tokenizer object, keeping the delimiters as tokens
        StringTokenizer tokens = new StringTokenizer( inputString, "+-/*", true );

        // get the first token and put its value into result
        if ((tok1 = tokens.nextToken()).equals("+"))
            tok1 = tokens.nextToken();
        else if (tok1.equals("-"))
            tok1 = "-".concat(tokens.nextToken());
        double result = new Double(tok1).doubleValue();

        // evaluate the expression
        while (tokens.hasMoreTokens())
        {
            // get the operator token
            tok1 = tokens.nextToken();

            // get the second operand token
            if ((tok2 = tokens.nextToken()).equals("+"))
                tok2 = tokens.nextToken();
            else if (tok2.equals("-"))
                tok2 = "-".concat(tokens.nextToken());

            // evaluate the subexpression
            switch (tok1.charAt(0))
            {
                case '+':
                    result += new Double(tok2).doubleValue();
                    break;
                case '-':
                    result -= new Double(tok2).doubleValue();
                    break;
                case '/':
                    result /= new Double(tok2).doubleValue();
                    break;
                case '*':
                    result *= new Double(tok2).doubleValue();
                    break;
            }
        }
        return result;
    }

    // reportError - Reports a syntax error to outputTA.  Always
    // returns false.
    protected boolean reportError( int index )
    {
        // create a new string with the first line of output
        String outputString = new String("Syntax error:\n");

        // echo the user input as second line
        outputString = outputString.concat( inputString );
        outputString = outputString.concat( "\n" );

        // display pointer to error position as third line
        for (int i = 0; i < index; i++)
            outputString = outputString.concat(" ");
        outputString = outputString.concat("^");

        // copy the output string text to the output text area
        outputTA.setText( outputString );

        return false;
    }

    // reset the form
    protected void clear()
    {
        inputTF.setText( "" );
        outputTA.setText( "" );
        return;
    }
}
