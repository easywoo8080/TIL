public class Service1 {
    Dao dao;

    public Service1(){
        dao = new Dao();
    }

    public void register(UserVO user){
        dao.insert(user);
    }
}
