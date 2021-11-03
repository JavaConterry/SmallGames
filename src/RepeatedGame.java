public interface RepeatedGame {


    Boolean Condition();

    public default void StartGame(){
        Inirializer();

        while (Condition()){
            GamingProcess();
        }

        Finish();
    }

    void Inirializer();

    void GamingProcess();

    void Finish();
}
