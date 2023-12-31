package com.api.parkingcontrol.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_parking_spot")
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    //id da entidade, vai ser gerado de forma automatica
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    //numero da vaga, pode conter letras e numeros, campo unico e limitado os caracteres
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;

    //placa do carro, unico pode ter letras e numeros
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;

    //marca do carro
    @Column(nullable = false, length = 70)
    private String brandCar;

    //modelo do carro
    @Column(nullable = false, length = 70)
    private String modelCar;

    //cor do carro
    @Column(nullable = false, length = 70)
    private String colorCar;

    //data do registro do veiculo na portaria para a vaga correspondente
    @Column(nullable = false)
    private LocalDateTime registrationDate;

    //nome do responsavel do veiculo
    @Column(nullable = false, length = 130)
    private String responsibleName;

    //numero do apartamento
    @Column(nullable = false, length = 30)
    private String apartment;

    //numero do bloco
    @Column(nullable = false, length = 30)
    private String block;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
