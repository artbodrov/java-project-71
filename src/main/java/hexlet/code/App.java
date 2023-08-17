package hexlet.code;

import hexlet.code.commands.DifferCom;
import picocli.CommandLine;

public class App {
    public static void main(String[] args) {
        int output = new CommandLine(new DifferCom()).execute(args);
        System.exit(output);
    }
}
