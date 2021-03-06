package ru.job4j.chess.firuges.black;


import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A8);
        assertThat(bishopBlack.position(), is(Cell.A8));
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A8);
        bishopBlack = (BishopBlack) bishopBlack.copy(Cell.B7);
        assertThat(bishopBlack.position(), is(Cell.B7));
    }

    @Test
    public void whenWayFromC1toG5() {
        BishopBlack bBlack = new BishopBlack(Cell.C1);
        Cell[] way = bBlack.way(Cell.G5);
        Cell[] exp = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(way, is(exp));
    }

    @Test
    public void whenWayFromF8toC5() {
        BishopBlack bBlack = new BishopBlack(Cell.F8);
        Cell[] way = bBlack.way(Cell.C5);
        Cell[] exp = {Cell.E7, Cell.D6, Cell.C5};
        assertThat(way, is(exp));
    }
}