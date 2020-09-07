/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Car;
//import javax.swing.JOptionPane;
import java.awt.Image;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import javax.imageio.ImageIO;
//import javax.swing.JFileChooser;
/**
 *
 * @author wangbochao
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private Car car;
    
    public ViewPanel(Car car) {
        initComponents();
        this.car=car;
        displayCar(car);
    }
    private void displayCar(Car car){
        //bing the textfield with
        String carName = car.getCarName();
        carNameTextField.setText(carName);
        
        String model = car.getModel();
        modelTextField.setText(model);
        
        String price = car.getPrice();
        priceTextField.setText(price);
        
        String exteriorColor = car.getExteriorColor();
        exteriorColorTextField.setText(exteriorColor);
        
        String productionYear = car.getProductionYear();
        productionYearTextField.setText(productionYear);
        
        String serialNumber = car.getSerialNumber();
        serialNumberTextField.setText(serialNumber);
        
        String fuelType = car.getFuelType();
        fuelTypeTextField.setText(fuelType);
        
        Image carImg=car.getCarImage();
        if (carImg!=null){
        imageLabel.setIcon(new javax.swing.ImageIcon(carImg));}
        
        String length = car.getLength();
        lengthTextField.setText(length);
        
        String width = car.getWidth();
        widthTextField.setText(width);
                       
        String height = car.getHeight();
        heightTextField.setText(height);
                        
        String seatQuantity = car.getSeatQuantity();
        seatQuantityTextField.setText(seatQuantity);
        
        String seatType = car.getSeatType();
        seatTypeTextField.setText(seatType);
        
        String fuelCapacity = car.getFuelCapacity();
        fuelCapacityTextField.setText(fuelCapacity);
        
        String maxCargoCapacity = car.getMaxCargoCapacity();
        maxCargoCapacityTextField.setText(maxCargoCapacity);
        
        String fuelConsumption = car.getFuelConsumption();
        fuelConsumptionTextField.setText(fuelConsumption);
        
        String engine = car.getEngine();
        engineTextField.setText(engine);
        
        String transmissionType = car.getTransmission();
        transmissionTypeTextField.setText(transmissionType);
        
        String drivetrainType = car.getDrivetrain();
        drivetrainTypeTextField.setText(drivetrainType);
        
        String navigationSystem = car.getNavigationSystem();
        navigationSystemTextField.setText(navigationSystem);
        
        String keylessStart = car.getKeylessStart();
        keylessStartTextField.setText(keylessStart);
       
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane = new javax.swing.JTabbedPane();
        BasicPanel = new javax.swing.JPanel();
        carNameLabel = new javax.swing.JLabel();
        carNameTextField = new javax.swing.JTextField();
        modelLabel = new javax.swing.JLabel();
        modelTextField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        dollarLabel = new javax.swing.JLabel();
        exteriorColorTextField = new javax.swing.JTextField();
        exteriorColorLabel = new javax.swing.JLabel();
        productionYearLabel = new javax.swing.JLabel();
        productionYearTextField = new javax.swing.JTextField();
        serialNumberLabel = new javax.swing.JLabel();
        serialNumberTextField = new javax.swing.JTextField();
        fuelTypeLabel = new javax.swing.JLabel();
        fuelTypeTextField = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();
        viewCarLabel = new javax.swing.JLabel();
        advancedPanel = new javax.swing.JPanel();
        dimensionsLabel = new javax.swing.JLabel();
        lengthLabel = new javax.swing.JLabel();
        lengthTextField = new javax.swing.JTextField();
        widthLabel = new javax.swing.JLabel();
        widthTextField = new javax.swing.JTextField();
        heightLabel = new javax.swing.JLabel();
        heightTextField = new javax.swing.JTextField();
        seatQuantityLabel = new javax.swing.JLabel();
        seatQuantityTextField = new javax.swing.JTextField();
        seatTypeLabel = new javax.swing.JLabel();
        seatTypeTextField = new javax.swing.JTextField();
        fuelCapacityLabel = new javax.swing.JLabel();
        fuelCapacityTextField = new javax.swing.JTextField();
        gallonLabel1 = new javax.swing.JLabel();
        maxCargoCapacityLabel = new javax.swing.JLabel();
        maxCargoCapacityTextField = new javax.swing.JTextField();
        fuelConsumptionLabel = new javax.swing.JLabel();
        fuelConsumptionTextField = new javax.swing.JTextField();
        gallonLabel2 = new javax.swing.JLabel();
        engineLabel = new javax.swing.JLabel();
        engineTextField = new javax.swing.JTextField();
        transmissionLabel = new javax.swing.JLabel();
        transmissionTypeTextField = new javax.swing.JTextField();
        drivetrainLabel = new javax.swing.JLabel();
        drivetrainTypeTextField = new javax.swing.JTextField();
        navigationSystemLabel = new javax.swing.JLabel();
        navigationSystemTextField = new javax.swing.JTextField();
        keylessStartLabel = new javax.swing.JLabel();
        keylessStartTextField = new javax.swing.JTextField();
        mpgLabel = new javax.swing.JLabel();

        carNameLabel.setText("Car Name");

        modelLabel.setText("Model");

        priceLabel.setText("Price");

        priceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextFieldActionPerformed(evt);
            }
        });

        dollarLabel.setText("$");

        exteriorColorLabel.setText("Exterior Color");

        productionYearLabel.setText("Production Year");

        productionYearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productionYearTextFieldActionPerformed(evt);
            }
        });

        serialNumberLabel.setText("Serial Number");

        serialNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialNumberTextFieldActionPerformed(evt);
            }
        });

        fuelTypeLabel.setText("Fuel Type");

        fuelTypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelTypeTextFieldActionPerformed(evt);
            }
        });

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defaultimage/defaultCar.png"))); // NOI18N

        viewCarLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        viewCarLabel.setText("View Your Car");

        javax.swing.GroupLayout BasicPanelLayout = new javax.swing.GroupLayout(BasicPanel);
        BasicPanel.setLayout(BasicPanelLayout);
        BasicPanelLayout.setHorizontalGroup(
            BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasicPanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasicPanelLayout.createSequentialGroup()
                        .addGroup(BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serialNumberLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fuelTypeLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serialNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fuelTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasicPanelLayout.createSequentialGroup()
                        .addGroup(BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BasicPanelLayout.createSequentialGroup()
                                .addGroup(BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(exteriorColorLabel)
                                    .addComponent(productionYearLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(BasicPanelLayout.createSequentialGroup()
                                .addComponent(priceLabel)
                                .addGap(18, 18, 18))
                            .addGroup(BasicPanelLayout.createSequentialGroup()
                                .addComponent(modelLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(BasicPanelLayout.createSequentialGroup()
                                .addComponent(carNameLabel)
                                .addGap(10, 10, 10)))
                        .addGroup(BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exteriorColorTextField)
                            .addComponent(productionYearTextField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasicPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(dollarLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(carNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addComponent(imageLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BasicPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(viewCarLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BasicPanelLayout.setVerticalGroup(
            BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasicPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(viewCarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BasicPanelLayout.createSequentialGroup()
                        .addGroup(BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carNameLabel)
                            .addComponent(carNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelLabel)
                            .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceLabel)
                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dollarLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exteriorColorLabel)
                            .addComponent(exteriorColorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productionYearLabel)
                            .addComponent(productionYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serialNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serialNumberLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BasicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fuelTypeLabel)
                            .addComponent(fuelTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );

        jTabbedPane.addTab("Basic", BasicPanel);

        dimensionsLabel.setText("dimensions (cm)");

        lengthLabel.setText("Length");

        lengthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthTextFieldActionPerformed(evt);
            }
        });

        widthLabel.setText("Width");

        widthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthTextFieldActionPerformed(evt);
            }
        });

        heightLabel.setText("Height");

        heightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTextFieldActionPerformed(evt);
            }
        });

        seatQuantityLabel.setText("Seat Quantity");

        seatQuantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatQuantityTextFieldActionPerformed(evt);
            }
        });

        seatTypeLabel.setText("Seat Type");

        seatTypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatTypeTextFieldActionPerformed(evt);
            }
        });

        fuelCapacityLabel.setText("Fuel Capacity");

        fuelCapacityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelCapacityTextFieldActionPerformed(evt);
            }
        });

        gallonLabel1.setText("gallon");

        maxCargoCapacityLabel.setText("Max Cargo Capacity");

        maxCargoCapacityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxCargoCapacityTextFieldActionPerformed(evt);
            }
        });

        fuelConsumptionLabel.setText("Fuel Consumption");

        fuelConsumptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelConsumptionTextFieldActionPerformed(evt);
            }
        });

        gallonLabel2.setText("gallon");

        engineLabel.setText("Engine");

        engineTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engineTextFieldActionPerformed(evt);
            }
        });

        transmissionLabel.setText("Transmission Type");

        transmissionTypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transmissionTypeTextFieldActionPerformed(evt);
            }
        });

        drivetrainLabel.setText("Drivetrain");

        drivetrainTypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drivetrainTypeTextFieldActionPerformed(evt);
            }
        });

        navigationSystemLabel.setText("Navigation System");

        navigationSystemTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigationSystemTextFieldActionPerformed(evt);
            }
        });

        keylessStartLabel.setText("Keyless Start");

        keylessStartTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keylessStartTextFieldActionPerformed(evt);
            }
        });

        mpgLabel.setText("mpg");

        javax.swing.GroupLayout advancedPanelLayout = new javax.swing.GroupLayout(advancedPanel);
        advancedPanel.setLayout(advancedPanelLayout);
        advancedPanelLayout.setHorizontalGroup(
            advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advancedPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dimensionsLabel)
                    .addGroup(advancedPanelLayout.createSequentialGroup()
                        .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, advancedPanelLayout.createSequentialGroup()
                                .addComponent(lengthLabel)
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, advancedPanelLayout.createSequentialGroup()
                                .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(heightLabel)
                                    .addComponent(widthLabel)
                                    .addComponent(seatQuantityLabel)
                                    .addComponent(seatTypeLabel)
                                    .addComponent(fuelCapacityLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(heightTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(widthTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lengthTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seatQuantityTextField)
                            .addComponent(fuelCapacityTextField)
                            .addComponent(seatTypeTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gallonLabel1)))
                .addGap(75, 75, 75)
                .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(advancedPanelLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(engineLabel)
                                .addComponent(fuelConsumptionLabel)
                                .addComponent(transmissionLabel)
                                .addComponent(drivetrainLabel)
                                .addComponent(navigationSystemLabel)))
                        .addComponent(maxCargoCapacityLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(keylessStartLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fuelConsumptionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(engineTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(maxCargoCapacityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(transmissionTypeTextField)
                    .addComponent(drivetrainTypeTextField)
                    .addComponent(navigationSystemTextField)
                    .addComponent(keylessStartTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gallonLabel2)
                    .addComponent(mpgLabel))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        advancedPanelLayout.setVerticalGroup(
            advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advancedPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dimensionsLabel)
                    .addComponent(maxCargoCapacityLabel)
                    .addComponent(maxCargoCapacityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gallonLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lengthLabel)
                    .addComponent(fuelConsumptionLabel)
                    .addComponent(fuelConsumptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mpgLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(widthLabel)
                    .addComponent(widthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(engineLabel)
                    .addComponent(engineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightLabel)
                    .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transmissionLabel)
                    .addComponent(transmissionTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatQuantityLabel)
                    .addComponent(drivetrainLabel)
                    .addComponent(drivetrainTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatTypeLabel)
                    .addComponent(navigationSystemLabel)
                    .addComponent(seatTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navigationSystemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuelCapacityLabel)
                    .addComponent(fuelCapacityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keylessStartLabel)
                    .addComponent(gallonLabel1)
                    .addComponent(keylessStartTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Advance", advancedPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void priceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextFieldActionPerformed

    private void productionYearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productionYearTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productionYearTextFieldActionPerformed

    private void serialNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialNumberTextFieldActionPerformed

    private void lengthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lengthTextFieldActionPerformed

    private void widthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_widthTextFieldActionPerformed

    private void heightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightTextFieldActionPerformed

    private void seatQuantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatQuantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatQuantityTextFieldActionPerformed

    private void fuelCapacityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelCapacityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuelCapacityTextFieldActionPerformed

    private void maxCargoCapacityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxCargoCapacityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxCargoCapacityTextFieldActionPerformed

    private void fuelConsumptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelConsumptionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuelConsumptionTextFieldActionPerformed

    private void engineTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engineTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_engineTextFieldActionPerformed

    private void fuelTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelTypeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuelTypeTextFieldActionPerformed

    private void seatTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatTypeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatTypeTextFieldActionPerformed

    private void transmissionTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transmissionTypeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transmissionTypeTextFieldActionPerformed

    private void drivetrainTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drivetrainTypeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drivetrainTypeTextFieldActionPerformed

    private void navigationSystemTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigationSystemTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navigationSystemTextFieldActionPerformed

    private void keylessStartTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keylessStartTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keylessStartTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BasicPanel;
    private javax.swing.JPanel advancedPanel;
    private javax.swing.JLabel carNameLabel;
    private javax.swing.JTextField carNameTextField;
    private javax.swing.JLabel dimensionsLabel;
    private javax.swing.JLabel dollarLabel;
    private javax.swing.JLabel drivetrainLabel;
    private javax.swing.JTextField drivetrainTypeTextField;
    private javax.swing.JLabel engineLabel;
    private javax.swing.JTextField engineTextField;
    private javax.swing.JLabel exteriorColorLabel;
    private javax.swing.JTextField exteriorColorTextField;
    private javax.swing.JLabel fuelCapacityLabel;
    private javax.swing.JTextField fuelCapacityTextField;
    private javax.swing.JLabel fuelConsumptionLabel;
    private javax.swing.JTextField fuelConsumptionTextField;
    private javax.swing.JLabel fuelTypeLabel;
    private javax.swing.JTextField fuelTypeTextField;
    private javax.swing.JLabel gallonLabel1;
    private javax.swing.JLabel gallonLabel2;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel keylessStartLabel;
    private javax.swing.JTextField keylessStartTextField;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JTextField lengthTextField;
    private javax.swing.JLabel maxCargoCapacityLabel;
    private javax.swing.JTextField maxCargoCapacityTextField;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JLabel mpgLabel;
    private javax.swing.JLabel navigationSystemLabel;
    private javax.swing.JTextField navigationSystemTextField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JLabel productionYearLabel;
    private javax.swing.JTextField productionYearTextField;
    private javax.swing.JLabel seatQuantityLabel;
    private javax.swing.JTextField seatQuantityTextField;
    private javax.swing.JLabel seatTypeLabel;
    private javax.swing.JTextField seatTypeTextField;
    private javax.swing.JLabel serialNumberLabel;
    private javax.swing.JTextField serialNumberTextField;
    private javax.swing.JLabel transmissionLabel;
    private javax.swing.JTextField transmissionTypeTextField;
    private javax.swing.JLabel viewCarLabel;
    private javax.swing.JLabel widthLabel;
    private javax.swing.JTextField widthTextField;
    // End of variables declaration//GEN-END:variables
}
