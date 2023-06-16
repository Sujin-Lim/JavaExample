
// 책 302페이지 1번 문제

package summary;

abstract class Abstract {
    int i;

    public Abstract(int i) {
        this.i = i;
    }
    abstract void show();
}
class Concrete extends Abstract{
    int j;

    public Concrete(int i, int j) {
        super(i);
        this.j = j;
    }
    void show(){
        System.out.println("i = " + i + ", j = " + j);
    }
}

