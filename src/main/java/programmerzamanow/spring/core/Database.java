package programmerzamanow.spring.core;

/*
    Singleton adalah Object yang hanya dibuat 1x saja dan mengembalikan object yang sama (spring framework konsep)
 */
public class Database {

    private static Database database;

    public static Database getInstance(){
        if (database ==  null){
            database = new Database();
        }
        return database;
    }

    private Database(){

    }
}
