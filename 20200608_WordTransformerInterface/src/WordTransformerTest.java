import org.junit.*;

public class WordTransformerTest {
    private WordTransformer wt;

    @Ignore

    @Before
    public void init(){
        wt = new WordTransformer();
        System.out.println("Test starts");
    }

    @After
    public void end(){
        System.out.println("Test is over");
    }

    @Test
    public void wordTransformerTest(){
       // WordTransformer wt = new WordTransformer();
        String input = "aaa GHJH knk HGhk";
        WordsChecker wc = new ToUpperCase();
        wt.transformWord(input, wc);
        String expected = "AAA GHJH KNK HGhk";
        String actual = wt.transformWord(input, wc);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replaceToStarTest1(){
       // WordTransformer wt = new WordTransformer();
        String input = "aaa GHJH nk HGhk";
        WordsChecker wc = new ReplaceToStar();
        wt.transformWord(input, wc);
        String expected = "aaa GHJH *k HGhk";
        String actual = wt.transformWord(input, wc);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replaceToStarTest2(){
        // WordTransformer wt = new WordTransformer();
        String input = "aaa GHJH kk HGhk";
        WordsChecker wc = new ReplaceToStar();
        wt.transformWord(input, wc);
        String expected = "aaa GHJH *k HGhk";
        String actual = wt.transformWord(input, wc);
        Assert.assertEquals(expected, actual);
    }
}
