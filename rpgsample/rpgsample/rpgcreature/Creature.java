package rpgcreature;

/**
 * 生物クラス
 * 勇者やモンスターの基本的な機能を持つクラス
 */
public abstract class Creature {
    private String name;
    protected int hp;

    /**
     * コンストラクタ
     * @param name：名前
     * @param hp：最大HP
     */
    public Creature(String name,int hp){
        this.name = name;
        this.hp = hp;
    }

    /**
     * 攻撃メソッド
     * @param opponent：攻撃相手
     */
    public abstract void attack(Creature opponent);

    /**
     * ダメージを受けるメソッド
     * @param damage：受けるダメージ数
     */
    public void damaged(int damage){
        hp -= damage;
        if( hp <0 ){
            hp = 0;
        }
    }

    /**
     * 生きているかを確認するメソッド
     * @return true:生きている false:死んでいる
     */
    public boolean isAlive(){
        return (hp>0);
    }

    /**
     * 名前を取得する
     * @return 取得した名前
     */
    public String getName(){
        return name;
    }

    /**
     * 現在のHPを取得する
     * @return 現在のHP
     */
    public int getHp(){
        return hp;
    }

    /**
     * ダメージを与えた際に表示するメッセージ
     * @param opponent ダメージを与えた相手
     * @param damage　与えたダメージ数
     */
    protected void displayMessage(Creature opponent,int damage){
        System.out.printf("%sは%sに%dのダメージを与えた\n",name,opponent.getName(),damage);
    }
}
