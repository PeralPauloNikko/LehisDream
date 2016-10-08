/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author EthicalH1
 */
public class Map implements Serializable{
    //class instance variables
    private String visited;
    private String rowCount;
    private String columnCount;

    public Map() {
    }
    

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public String getRowCount() {
        return rowCount;
    }

    public void setRowCount(String rowCount) {
        this.rowCount = rowCount;
    }

    public String getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(String columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.visited);
        hash = 97 * hash + Objects.hashCode(this.rowCount);
        hash = 97 * hash + Objects.hashCode(this.columnCount);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "visited=" + visited + ", rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (!Objects.equals(this.columnCount, other.columnCount)) {
            return false;
        }
        return true;
    }
    
    
}


