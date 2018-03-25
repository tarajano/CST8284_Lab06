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
public class LoadWordsAsStringBuilder extends LoadWords {

  /**
   * 
   */
  public LoadWordsAsStringBuilder() {
    // TODO Auto-generated constructor stub
  }

  /* (non-Javadoc)
   * @see cst8284.lab6.LoadWords#getFileContents(java.io.File)
   */
  @Override
  public Text getFileContents(File f) {
    StringBuilder txtStringBuilder = new StringBuilder(); 
    try {
      Scanner fileIn = new Scanner(f);
      while (fileIn.hasNext()){
        txtStringBuilder.append(fileIn.nextLine());
      }
      fileIn.close();
    } catch(FileNotFoundException e){};
    return (new Text(txtStringBuilder.toString()));
  }

}