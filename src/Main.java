//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            System.out.println("second commit");
            System.out.println("hot-fixed");
            System.out.println("與hot-fixed產生衝突:master test");
            System.out.println("hot-fixed test conflict");
            System.out.println("test intelliJ");
            System.out.println("test rebase merge master");
             System.out.println("test git fetch");
            //==test cherry pick
            System.out.println("member1修改文件");
        }
    }
}