package JDK_8.Java_8_Function_Programming.chapter_3.A5.a2;

import JDK_8.Java_8_Function_Programming.chapter_3.A5.a1.User;
import JDK_8.Java_8_Function_Programming.chapter_3.A5.a1.User_Data;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 14:56
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<User> users = User_Data.create();

        List<OldUser> oldUsers = users.stream()
                .map(
                        user ->
                        {
                            OldUser oldUser = new OldUser();
                            oldUser.setName(user.getName());
                            oldUser.setAge(user.getAge());
                            if (user.getAge() > 60){
                                oldUser.setNote("老人");
                            }
                            return oldUser;
                        }
                ).collect(Collectors.toList());

        System.out.println(oldUsers);
//[OldUser{name='张0', age=79, note='老人'},
// OldUser{name='许1', age=89, note='老人'},
// OldUser{name='陈2', age=65, note='老人'},
// OldUser{name='王3', age=40, note='null'},
// OldUser{name='许4', age=74, note='老人'},
// OldUser{name='刘5', age=90, note='老人'},
// OldUser{name='张6', age=1, note='null'},
// OldUser{name='刘7', age=38, note='null'},
// OldUser{name='刘8', age=46, note='null'},
// OldUser{name='陈9', age=41, note='null'},
// OldUser{name='陈10', age=0, note='null'},
// OldUser{name='张11', age=30, note='null'},
// OldUser{name='刘12', age=26, note='null'},
// OldUser{name='陈13', age=70, note='老人'},
// OldUser{name='许14', age=34, note='null'},
// OldUser{name='许15', age=25, note='null'},
// OldUser{name='王16', age=36, note='null'},
// OldUser{name='许17', age=94, note='老人'},
// OldUser{name='王18', age=97, note='老人'}, OldUser{name='张19', age=76, note='老人'},
// OldUser{name='刘20', age=96, note='老人'}, OldUser{name='许21', age=33, note='null'},
// OldUser{name='刘22', age=12, note='null'}, OldUser{name='张23', age=11, note='null'}, OldUser{name='张24', age=52, note='null'},
// OldUser{name='刘25', age=83, note='老人'}, OldUser{name='陈26', age=1, note='null'}, OldUser{name='许27', age=13, note='null'},
// OldUser{name='刘28', age=98, note='老人'}, OldUser{name='陈29', age=99, note='老人'}]



    }

}
