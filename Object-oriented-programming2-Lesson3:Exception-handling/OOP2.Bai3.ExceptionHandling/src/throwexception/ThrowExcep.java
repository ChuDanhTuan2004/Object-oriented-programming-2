package throwexception;

public class ThrowExcep {
    static void fun()
    {
        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught in main.");
        }
    }
}

/**Lệnh "throw" trong đoạn mã trên được sử dụng để ném một exception mới mà ta tạo ra phía trong khối "try"
 * bên trong phương thức "fun()".
 * Cụ thể ở đây, ta tạo ra một đối tượng "NullPointerException"
 * với thông báo "demo" và ném nó ra bên ngoài khối "try" bằng cách sử dụng lệnh "throw".
 * Sau đó, đối tượng "NullPointerException" này sẽ được bắt lại và xử lý trong khối "catch" bên trong phương thức "fun()".
 * Trong khối "catch" này, ta hiển thị thông báo "Caught inside fun()" và sau đó ném lại đối tượng "NullPointerException"
 * với cùng một thông báo "demo" bằng cách sử dụng lệnh "throw".
 * Khi đối tượng "NullPointerException" này được ném lại,
 * nó sẽ được bắt lại và xử lý trong khối "catch" bên ngoài của phương thức "main()",
 * nơi ta sẽ hiển thị thông báo "Caught in main".**/
