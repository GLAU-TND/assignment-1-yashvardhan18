import Menu.Menu;
public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Menu menu = new Menu();
        while (flag) {
            int n = menu.choice();
            switch (n) {
                case 1:
                    menu.new_contact();
                    break;
                case 2:
                    menu.view();
                    break;
                case 3:
                    menu.search();
                    break;
                case 4:
                    menu.deleteChoice();
                    break;
                case 5:
                    menu.exitChoice();
                    flag = false;
                    break;
            }
        }
    }
}
