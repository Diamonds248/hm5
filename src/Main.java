public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(200);
        boss.setDamage(50);
        boss.setDefenceType("Physical");
        System.out.println("HEALTH: "+boss.getHealth()+"\nDAMAGE: "+boss.getDamage()+"\nDEFENCE TUPE: "+boss.getDefenceType());
    }
}