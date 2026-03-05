package prototype.test;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        citation.setName("张三");
        Citation citation1 = citation.clone();
        citation1.setName("李四");
        System.out.println(citation);
        System.out.println(citation1);
        System.out.println(citation.equals(citation1));
    }
}
