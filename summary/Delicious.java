
// 책 302페이지 2번 문제

package summary;

interface Edible {
    void eat();
}
interface Sweetable{
    void sweet();
}
public interface Delicious extends Edible, Sweetable{

}

