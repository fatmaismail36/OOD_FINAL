/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supplychaintrackingsystem;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class OrderGUI extends javax.swing.JFrame {

 private Order order;
private final List<Order> orders = new ArrayList<>();
private final List<Product> orderProducts = new ArrayList<>();
private Manufacturer manufacturer;
private Supplier supplier;
private int nextOrderID = 1;

public OrderGUI() {
    initComponents();

    order = new Order();

    manufacturer = new Manufacturer(
            1,
            "Manufacturer User",
            "manufacturer@gmail.com",
            "abc123",
            "Manufacturer",
            "Cairo Factory"
    );

    supplier = new Supplier(
            2,
            "Supplier User",
            "supplier@gmail.com",
            "abc123",
            "Supplier",
            101,
            "Fresh Supply Company",
            "01012345678",
            "Cairo"
    );

    txtOrderID.setEditable(false);
    txtOrderDate.setEditable(false);
    txtEstimatedDelivery.setEditable(false);
    txtTotalAmount.setEditable(false);

    // Product name, unit price, and availability should be filled by the system.
    txtProductName.setEditable(false);
    txtUnitPrice.setEditable(false);
    Availability.setEditable(false);

    txtOrderDate.setText(order.getOrderLocalDate().toString());
    txtEstimatedDelivery.setText(order.getEstimatedDeliveryLocalDate().toString());
    Availability.setText("");

    // Add this because your btnBack currently has no action listener in initComponents().
    btnBack.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBackActionPerformed(evt);
        }
    });
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOrderID = new javax.swing.JTextField();
        txtOrderDate = new javax.swing.JTextField();
        txtEstimatedDelivery = new javax.swing.JTextField();
        cmbOrderStatus = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCustomerID = new javax.swing.JTextField();
        txtProductID = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        Availability = new javax.swing.JTextField();
        btnCreateOrder = new javax.swing.JButton();
        btnGetOrders = new javax.swing.JButton();
        btnCalculateTotal = new javax.swing.JButton();
        btnCheckAvailability = new javax.swing.JButton();
        btnUpdateStatus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Order Management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 102, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Order ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Order Date:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Order Status:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Estimated Delivery:");

        txtOrderID.setEditable(false);

        txtOrderDate.setEditable(false);
        txtOrderDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderDateActionPerformed(evt);
            }
        });

        txtEstimatedDelivery.setEditable(false);
        txtEstimatedDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstimatedDeliveryActionPerformed(evt);
            }
        });

        cmbOrderStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Processing", "Confirmed", "Shipped", "Delivered", "Cancelled" }));
        cmbOrderStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrderStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstimatedDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtEstimatedDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Retailer & Product Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 204, 0))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Retailer ID:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Product ID:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Product Name:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Quantity:");

        txtProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIDActionPerformed(evt);
            }
        });

        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCustomerID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProductID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuantity))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(204, 0, 255))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Unit Price:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Total Amount:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Availability:");

        txtTotalAmount.setEditable(false);
        txtTotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAmountActionPerformed(evt);
            }
        });

        txtUnitPrice.setEditable(false);
        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Availability)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUnitPrice))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalAmount)))
                        .addGap(6, 6, 6))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Availability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        btnCreateOrder.setBackground(new java.awt.Color(33, 150, 243));
        btnCreateOrder.setForeground(new java.awt.Color(242, 242, 242));
        btnCreateOrder.setText("Create Order");
        btnCreateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrderActionPerformed(evt);
            }
        });

        btnGetOrders.setBackground(new java.awt.Color(0, 172, 193));
        btnGetOrders.setForeground(new java.awt.Color(242, 242, 242));
        btnGetOrders.setText("Get Orders");
        btnGetOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetOrdersActionPerformed(evt);
            }
        });

        btnCalculateTotal.setBackground(new java.awt.Color(76, 175, 80));
        btnCalculateTotal.setForeground(new java.awt.Color(242, 242, 242));
        btnCalculateTotal.setText("Calculate Total");
        btnCalculateTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateTotalActionPerformed(evt);
            }
        });

        btnCheckAvailability.setBackground(new java.awt.Color(255, 152, 0));
        btnCheckAvailability.setForeground(new java.awt.Color(242, 242, 242));
        btnCheckAvailability.setText("Check Availability");
        btnCheckAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckAvailabilityActionPerformed(evt);
            }
        });

        btnUpdateStatus.setBackground(new java.awt.Color(156, 39, 176));
        btnUpdateStatus.setForeground(new java.awt.Color(242, 242, 242));
        btnUpdateStatus.setText("Update Status");
        btnUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatusActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(158, 158, 158));
        btnClear.setForeground(new java.awt.Color(242, 242, 242));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(96, 125, 139));
        btnBack.setForeground(new java.awt.Color(242, 242, 242));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 220, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnCreateOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGetOrders)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalculateTotal)
                        .addGap(18, 18, 18)
                        .addComponent(btnCheckAvailability)
                        .addGap(28, 28, 28)
                        .addComponent(btnUpdateStatus)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateOrder)
                    .addComponent(btnGetOrders)
                    .addComponent(btnCalculateTotal)
                    .addComponent(btnCheckAvailability)
                    .addComponent(btnUpdateStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnClear))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOrderStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrderStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOrderStatusActionPerformed

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void txtOrderDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderDateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
 txtOrderID.setText("");
    txtCustomerID.setText("");
    txtProductID.setText("");
    txtProductName.setText("");
    txtQuantity.setText("");
    txtUnitPrice.setText("");
    txtTotalAmount.setText("");
    Availability.setText("");

    Order newOrder = new Order();
    txtOrderDate.setText(newOrder.getOrderLocalDate().toString());
    txtEstimatedDelivery.setText(newOrder.getEstimatedDeliveryLocalDate().toString());

    cmbOrderStatus.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAmountActionPerformed

    private void txtEstimatedDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstimatedDeliveryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstimatedDeliveryActionPerformed

    private void txtProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIDActionPerformed

    private void btnCalculateTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateTotalActionPerformed
      
 try {
        int quantity = parseRequiredInt(txtQuantity.getText(), "Quantity");
        double unitPrice = parseRequiredDouble(txtUnitPrice.getText(), "Unit Price");

        double total = quantity * unitPrice;

        txtTotalAmount.setText(String.valueOf(total));

        JOptionPane.showMessageDialog(this,
                "Total calculated successfully.\n"
                + "Quantity: " + quantity + "\n"
                + "Unit Price: " + unitPrice + "\n"
                + "Total Amount: " + total,
                "Calculate Total",
                JOptionPane.INFORMATION_MESSAGE);

    } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(this,
                ex.getMessage(),
                "Validation Error",
                JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this,
                "Unexpected error while calculating total: " + ex.getMessage(),
                "Order Error",
                JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btnCalculateTotalActionPerformed

    private void btnCheckAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckAvailabilityActionPerformed
     try {
        int productID = parseRequiredInt(txtProductID.getText(), "Product ID");

        Product product = createDemoProduct(productID);

        txtProductName.setText(product.getProductName());
        txtUnitPrice.setText(String.valueOf(product.getUnitPrice()));

        boolean available = product.isAvailable();

        if (available) {
            Availability.setText("Available");
            JOptionPane.showMessageDialog(this,
                    "Product is available.\n"
                    + "Product ID: " + product.getProductID() + "\n"
                    + "Product Name: " + product.getProductName() + "\n"
                    + "Unit Price: " + product.getUnitPrice(),
                    "Check Availability",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            Availability.setText("Not Available");
            JOptionPane.showMessageDialog(this,
                    "Product is not available.",
                    "Check Availability",
                    JOptionPane.WARNING_MESSAGE);
        }

    } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(this,
                ex.getMessage(),
                "Validation Error",
                JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this,
                "Unexpected error while checking availability: " + ex.getMessage(),
                "Order Error",
                JOptionPane.ERROR_MESSAGE);
    }
   
    }//GEN-LAST:event_btnCheckAvailabilityActionPerformed

    private void btnUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatusActionPerformed
     
        try {
        int orderID = parseRequiredInt(txtOrderID.getText(), "Order ID");

        Order foundOrder = findOrderByID(orderID);

        if (foundOrder == null) {
            throw new IllegalArgumentException("Order ID was not found.");
        }

        String status = (String) cmbOrderStatus.getSelectedItem();

        foundOrder.updateStatus(status);

        JOptionPane.showMessageDialog(this,
                "Order status updated successfully.\n"
                + "Order ID: " + foundOrder.getOrderID() + "\n"
                + "New Status: " + foundOrder.getOrderStatus(),
                "Update Status",
                JOptionPane.INFORMATION_MESSAGE);

    } catch (IllegalArgumentException | IllegalStateException ex) {
        JOptionPane.showMessageDialog(this,
                ex.getMessage(),
                "Validation Error",
                JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this,
                "Unexpected error while updating status: " + ex.getMessage(),
                "Order Error",
                JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btnUpdateStatusActionPerformed

    private void btnCreateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOrderActionPerformed
 
         try {
        int retailerID = parseRequiredInt(txtCustomerID.getText(), "Retailer ID");
        int productID = parseRequiredInt(txtProductID.getText(), "Product ID");
        int quantity = parseRequiredInt(txtQuantity.getText(), "Quantity");

        if (Availability.getText().trim().isEmpty()) {
            throw new IllegalArgumentException("Please check product availability first.");
        }

        if (!Availability.getText().equalsIgnoreCase("Available")) {
            throw new IllegalStateException("Order cannot be created because the product is not available.");
        }

        Product product = createDemoProduct(productID);

        txtProductName.setText(product.getProductName());
        txtUnitPrice.setText(String.valueOf(product.getUnitPrice()));

        orderProducts.clear();

        for (int i = 0; i < quantity; i++) {
            Product item = new Product(
                    productID,
                    product.getProductName(),
                    product.getCategory(),
                    new java.util.Date(),
                    new java.util.Date(System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000),
                    product.getUnitPrice()
            );

            item.setStatus("Available");
            orderProducts.add(item);

            manufacturer.startProduction(item);
            supplier.addSuppliedProduct(item);
        }

        int generatedOrderID = nextOrderID++;

        order = new Order(generatedOrderID, retailerID, orderProducts);
        order.setStatus((String) cmbOrderStatus.getSelectedItem());

        orders.add(order);

        txtOrderID.setText(String.valueOf(order.getOrderID()));
        txtOrderDate.setText(order.getOrderLocalDate().toString());
        txtEstimatedDelivery.setText(order.getEstimatedDeliveryLocalDate().toString());
        txtTotalAmount.setText(String.valueOf(order.getTotalAmount()));

        JOptionPane.showMessageDialog(this,
                "Order created successfully!\n"
                + "Order ID: " + order.getOrderID() + "\n"
                + "Retailer ID: " + retailerID + "\n"
                + "Product ID: " + productID + "\n"
                + "Product Name: " + product.getProductName() + "\n"
                + "Quantity: " + quantity + "\n"
                + "Total Amount: " + order.getTotalAmount() + "\n"
                + "Status: " + order.getOrderStatus(),
                "Create Order",
                JOptionPane.INFORMATION_MESSAGE);

    } catch (IllegalArgumentException | IllegalStateException ex) {
        JOptionPane.showMessageDialog(this,
                ex.getMessage(),
                "Validation Error",
                JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this,
                "Unexpected error while creating order: " + ex.getMessage(),
                "Order Error",
                JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnCreateOrderActionPerformed

    private void btnGetOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetOrdersActionPerformed
   try {
        int orderID = parseRequiredInt(txtOrderID.getText(), "Order ID");

        Order foundOrder = findOrderByID(orderID);

        if (foundOrder == null) {
            throw new IllegalArgumentException("Order ID was not found.");
        }

        // Read-Only design pattern is applied here.
        OrderReadOnly readOnlyOrder = foundOrder;

        String details =
                "Read-Only Order Details\n"
                + "--------------------------------\n"
                + "Order ID: " + readOnlyOrder.getOrderID() + "\n"
                + "Order Date: " + readOnlyOrder.getOrderDate() + "\n"
                + "Order Status: " + readOnlyOrder.getOrderStatus() + "\n"
                + "Quantity: " + readOnlyOrder.getQuantity() + "\n"
                + "Estimated Delivery: " + readOnlyOrder.getEstimatedDelivery() + "\n"
                + "Order Type: " + readOnlyOrder.getOrderType().getTypeName() + "\n"
                + "Total Amount: " + foundOrder.getTotalAmount();

        JOptionPane.showMessageDialog(this,
                details,
                "Get Orders - Read Only View",
                JOptionPane.INFORMATION_MESSAGE);

    } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(this,
                ex.getMessage(),
                "Validation Error",
                JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this,
                "Unexpected error while getting orders: " + ex.getMessage(),
                "Order Error",
                JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnGetOrdersActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
          try {
        new RetailerGUI().setVisible(true);
        dispose();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this,
                "Unable to return to retailer page: " + ex.getMessage(),
                "Navigation Error",
                JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnBackActionPerformed
private int parseRequiredInt(String value, String fieldName) {
    String text = value == null ? "" : value.trim();

    if (text.isBlank()) {
        throw new IllegalArgumentException(fieldName + " cannot be empty.");
    }

    if (!text.matches("\\d+")) {
        throw new IllegalArgumentException(fieldName + " must contain numbers only.");
    }

    int number = Integer.parseInt(text);

    if (number <= 0) {
        throw new IllegalArgumentException(fieldName + " must be greater than 0.");
    }

    return number;
}

private double parseRequiredDouble(String value, String fieldName) {
    String text = value == null ? "" : value.trim();

    if (text.isBlank()) {
        throw new IllegalArgumentException(fieldName + " cannot be empty.");
    }

    try {
        double number = Double.parseDouble(text);

        if (number < 0) {
            throw new IllegalArgumentException(fieldName + " cannot be negative.");
        }

        return number;

    } catch (NumberFormatException ex) {
        throw new IllegalArgumentException(fieldName + " must be a valid number.");
    }
}

private Order findOrderByID(int orderID) {
    for (Order savedOrder : orders) {
        if (savedOrder.getOrderID() == orderID) {
            return savedOrder;
        }
    }
    return null;
}

private Product createDemoProduct(int productID) {
    Product product = new Product(
            productID,
            "Product " + productID,
            "General",
            new java.util.Date(),
            new java.util.Date(System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000),
            100.0
    );

    product.setStatus("Available");

    Inventory inventory = new Inventory();
    inventory.setProductID(productID);
    inventory.setProductName(product.getProductName());
    inventory.setProduct(product);
    inventory.setStockLevel(50);

    product.setInventory(inventory);

    return product;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Availability;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalculateTotal;
    private javax.swing.JButton btnCheckAvailability;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreateOrder;
    private javax.swing.JButton btnGetOrders;
    private javax.swing.JButton btnUpdateStatus;
    private javax.swing.JComboBox<String> cmbOrderStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtEstimatedDelivery;
    private javax.swing.JTextField txtOrderDate;
    private javax.swing.JTextField txtOrderID;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables
}
