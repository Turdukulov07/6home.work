public class Main {

    public static void main(String[] args){
        Boss b = new Boss();
        b.setHealth(700);
        b.setDomage(111);
        b.setCombat("АК");
        b.setWeapon(47);
        System.out.println("Boss Health =" + " " + b.getHealth() + "  " + "Boss domage =" + " " + b.getDomage());
        System.out.println("Boss combat =" + " " + b.getCombat() + " " + "Boss weapon =" + " " + b.getWeapon());

    }
}
