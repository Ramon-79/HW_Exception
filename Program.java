
import base.classes.Presenter;
import base.classes.checkInputData.*;
import base.classes.parseData.CDataParseProcessor;
import base.classes.ui.CGetData;
import base.classes.workWithFile.CFileCreator;
import base.classes.workWithFile.CFileWriter;
import base.classes.workWithFile.CFindTheSameFileName;


import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        String infoPathFolder = "Path to the file";
        Presenter presenter = new Presenter(new CGetData(),
                                            new CDataParseProcessor(),
                                            new CCheckDataProcessor(new CCheckQuantity(),
                                                                    new CCheckFullName(),
                                                                    new CCheckBirthday(),
                                                                    new CCheckSex()),
                                            new CFileWriter(new CFileCreator(),
                                                            new CFindTheSameFileName(),
                                                    infoPathFolder));
        presenter.run();
    }
}