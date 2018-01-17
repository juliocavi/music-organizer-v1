import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * Utilizo mi metodo validIndex.
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index) == true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Utilizo mi metodo validIndex.
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index) == true) {
            files.remove(index);
        }
    }

    /**
     * Checkeo de indices validos.
     * @param index The index of the file to be checked.
     */
    public void checkIndex(int index)
    {
        if(index < 0 || index >= files.size()) {
            System.out.println("El rango valido esta entre 0 y " + (files.size()-1) + " incluidos");
        }
    }

    /**
     * Checkeo de indices validos.
     * Devuelve true si el indice es valido y false si no lo es.
     * @param index The index of the file to be checked.
     */
    public boolean validIndex(int index)
    {
        boolean indiceValido = false;
        if(index >= 0 && index < files.size()) {
            indiceValido = true;
        }
        return indiceValido;
    }
}

