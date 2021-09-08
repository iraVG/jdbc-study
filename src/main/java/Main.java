import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
//        User user = new User();
//        user.setName("Andrew");
//        user.setAge(27);
        // userDao.insertUser(user);
        //userDao.deleteUserById(5);
        List<User> userList = userDao.findAllUsers();
        userList.forEach(System.out::println);

        System.out.println(userDao.getNameByUserId(2));

    }
}
