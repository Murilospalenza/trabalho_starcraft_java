package trabalho_poo;

public class Protoss extends Unit{
    public lifeSteal(int max_hp,int current_hp){
        if(current_hp > max_hp /2){
            current_hp += max_hp * 0.05;
        }
    }
}