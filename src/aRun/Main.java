package aRun;

import pack1Brewery.Ale;
import pack1Brewery.Beer;
import pack1Brewery.Lager;
import pack2HospitalManagement.Anesthesiologist;
import pack2HospitalManagement.Doctor;
import pack2HospitalManagement.Orthopedic;
import pack4MusicStreaming.Playlist;
import pack4MusicStreaming.Song;

public class Main
{
  public static void main(String[] args)
  {

    Beer paleAle = new Ale();
    System.out.println(paleAle.getPricePerBottle());


  }
}
