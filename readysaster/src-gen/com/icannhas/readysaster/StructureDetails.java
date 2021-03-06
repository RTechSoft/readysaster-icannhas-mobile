package com.icannhas.readysaster;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table STRUCTURE_DETAILS.
 */
public class StructureDetails {

    private Long id;
    private Integer house_size;
    private String building_material;
    private String structure_type;
    private Integer number_storey;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public StructureDetails() {
    }

    public StructureDetails(Long id) {
        this.id = id;
    }

    public StructureDetails(Long id, Integer house_size, String building_material, String structure_type, Integer number_storey) {
        this.id = id;
        this.house_size = house_size;
        this.building_material = building_material;
        this.structure_type = structure_type;
        this.number_storey = number_storey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHouse_size() {
        return house_size;
    }

    public void setHouse_size(Integer house_size) {
        this.house_size = house_size;
    }

    public String getBuilding_material() {
        return building_material;
    }

    public void setBuilding_material(String building_material) {
        this.building_material = building_material;
    }

    public String getStructure_type() {
        return structure_type;
    }

    public void setStructure_type(String structure_type) {
        this.structure_type = structure_type;
    }

    public Integer getNumber_storey() {
        return number_storey;
    }

    public void setNumber_storey(Integer number_storey) {
        this.number_storey = number_storey;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
