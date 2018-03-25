/**
 * 
 */
package cst8284.lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.scene.text.Text;

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Mar 23, 2018  
 */
public class LoadWordsAsString extends LoadWords {

  private int wordsCount;
  
  public LoadWordsAsString() {
    // TODO Auto-generated constructor stub
  }

  /* (non-Javadoc)
   * @see cst8284.lab6.LoadWords#getFileContents(java.io.File)
   */
  @Override
  public Text getFileContents(File f) {
    String txtString = "";  
    try {
      Scanner fileIn = new Scanner(f);
      Counters.resetCtr();
      while (fileIn.hasNext()){
        txtString += fileIn.nextLine() + "\n";
        wordsCount = Counters.getNextCtr();
      }
      fileIn.close();
    } catch(FileNotFoundException e){};
    return (new Text(txtString));
    //return (new Text("LoadWordsAsStringOverriden"));
  }

}
