package Apps;

import java.io.IOException;

public class Parent1 {
    public void f() throws IOException, InterruptedException {}
}

class ChildB extends Parent1 {
    @Override
    public void f() throws Exception {}
}
