package com.github.drxaos.edu;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Reloadable {

    void reload() throws FileOperationException, IOException, ClassNotFoundException;

}
