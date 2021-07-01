package fr.anatom3000.gwwhit.commandline;

public class CommandLine {
    public static void main(String[] args) {
        try {
            ModUpdater.main(args);
        } catch (Throwable e) {
            System.out.println("Something went while loading! Did you use the correct jar?");
            if (Util.contains(args, "--debug")) e.printStackTrace();
        }
    }
}
