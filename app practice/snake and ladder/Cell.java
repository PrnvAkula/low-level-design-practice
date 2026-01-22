import enums.CellType;

public class Cell {
    private int number;
    private CellType cellType;

    public Cell(int number){
        this.number = number;
        cellType = CellType.NUMBER;
    }

    public int getCellNumber(){
        return number;
    }

    public CellType getCellType(){
        return cellType;
    }

    public void setCellType(CellType cellType){
        this.cellType = cellType;
    }
}
