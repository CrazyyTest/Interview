public class GitCommand {
    public static void main(String[] args) {
        //        add message(comment) to commit we can use next command
        System.out.println("-m");
//        to check actual uncommited change we can use next command
        System.out.println("git diff");
        //        to check git status, unstaged and staged file we can use next command
        System.out.println("git status");
        //        To see all commits we can use next command
        System.out.println("git log");
        System.out.println("To check changes in every commit we can use next command:" +
                //    the * symbol is only used to highlight something
                "git show (and enter the first four unique hash)");
//        to add change in the last added commit we would use the next command
        System.out.println("git commit --amend -m 'comment with changes'");
    }
}
