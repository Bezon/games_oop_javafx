package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;

class BishopBlackTest {

    @Test
    public void whenStartPositionA3() {
        BishopBlack result = new BishopBlack(Cell.A3);
        assertThat(result.position()).isEqualTo(Cell.A3);
    }

    @Test
    public void whenCopyB2() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        Figure result = bishopBlack.copy(Cell.B2);
        assertThat(result.position()).isEqualTo(Cell.B2);
    }

    @Test
    public void whenBishopWayC1toG5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenBishopWayC8toA6() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell[] result = bishopBlack.way(Cell.A6);
        Cell[] expected = {Cell.B7, Cell.A6};
        assertThat(result).containsExactly(expected);
    }
}