import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.productManager;
public class productManagerTest {
    @Test
    public void test() {
        String film1 = "movie 1";
        String film2 = "movie 2";
        String film3 = "movie 3";
        String film4 = "movie 4";
        String film5 = "movie 5";

        productManager manager = new productManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3, film4, film5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        String film1 = "movie 1";
        String film2 = "movie 2";
        String film3 = "movie 3";
        String film4 = "movie 4";
        String film5 = "movie 5";

        productManager manager = new productManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);

        String[] actual = manager.findLast();
        String[] expected = {film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        String film1 = "movie 1";
        String film2 = "movie 2";
        String film3 = "movie 3";
        String film4 = "movie 4";
        String film5 = "movie 5";
        String film6 = "movie 6";
        String film7 = "movie 7";
        String film8 = "movie 8";
        String film9 = "movie 9";
        String film10 = "movie 10";


        productManager manager = new productManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }}
