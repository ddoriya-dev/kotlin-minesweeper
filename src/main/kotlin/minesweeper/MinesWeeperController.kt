package minesweeper

import minesweeper.view.InputView
import minesweeper.view.ResultView

class MinesWeeperGame(
    private val inputView: InputView,
    private val resultView: ResultView,
) {
    fun start() {
        val height = inputView.inputHeight()
        val width = inputView.inputWidth()
        val mineCount = inputView.inputMineCount()

        val minesWeeperService = MinesWeeperService(height, width, mineCount)
        val board = minesWeeperService.createCells()
        minesWeeperService.addMineAroundCounts()
        resultView.printBoard(board)
    }
}

fun main() {
    MinesWeeperGame(InputView(), ResultView()).start()
}
