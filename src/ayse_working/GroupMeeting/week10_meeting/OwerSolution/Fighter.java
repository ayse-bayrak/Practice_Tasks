package ayse_working.GroupMeeting.week10_meeting.OwerSolution;

public class Fighter {

    public String name;
    public int health;
    public int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter enemy){
        enemy.health -= this.damagePerAttack;
    }

}