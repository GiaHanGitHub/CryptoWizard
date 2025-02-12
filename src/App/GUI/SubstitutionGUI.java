/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package App.GUI;

import App.readFile.readFile;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Phuc Toan
 */
public class SubstitutionGUI extends javax.swing.JPanel {

    private String tempKeyofBanRo;
    private String tempKeyofBanMa;

    public SubstitutionGUI() {
        initComponents();
    }
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String plaintext, String key) {
    // Hàm mã hóa chính
    StringBuilder ciphertext = new StringBuilder();

    for (int i = 0; i < plaintext.length(); i++) {
        char c = plaintext.charAt(i);
        char encryptedChar;

        if (Character.isUpperCase(c)) {
            int index = ALPHABET.indexOf(Character.toLowerCase(c));
            if (index != -1) {
                encryptedChar = Character.toUpperCase(key.charAt(index));
                ciphertext.append(encryptedChar);
            } else {
                ciphertext.append(c);
            }
        } else if (Character.isLowerCase(c)) {
            int index = ALPHABET.indexOf(c);
            if (index != -1) {
                encryptedChar = key.charAt(index);
                ciphertext.append(encryptedChar);
            } else {
                ciphertext.append(c);
            }
        } else {
            ciphertext.append(c);
        }
    }

    return ciphertext.toString();
}
    public static boolean isKeyValid(String key) {
        // Kiểm tra xem key có đủ 26 ký tự
        if (key.length() != 26) {
            return false;
        }

        // Kiểm tra xem key có chứa ít nhất một ký tự in hoa hoặc ít nhất một ký tự in thường
        boolean hasUppercase = false;
        boolean hasLowercase = false;

        for (char c : key.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            }

            // Kiểm tra xem ký tự đã xuất hiện trong key trước đó hay chưa
            if (key.indexOf(c) != key.lastIndexOf(c)) {
                return false; // Có ký tự lặp lại trong key
            }
        }

        if (hasUppercase || hasLowercase) {
            return true;
        }

        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtKhoaKofBanMa = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtBanMa = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnGiaiMa = new javax.swing.JButton();
        btnTaoKhoaNgauNhienofBanMa = new javax.swing.JButton();
        btnChooseFileBanMa = new javax.swing.JButton();
        btnLuuKhoaBanMa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBanRo = new javax.swing.JTextArea();
        txtKhoaKofBanRo = new javax.swing.JTextField();
        btnMaHoa = new javax.swing.JButton();
        btnChooseFileBanRo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnTaoKhoaNgauNhienofBanRo = new javax.swing.JButton();
        btnLuuKhoaBanRo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel4.setPreferredSize(new java.awt.Dimension(1153, 689));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 249, 249));
        jPanel1.setPreferredSize(new java.awt.Dimension(1153, 689));

        jPanel2.setBackground(new java.awt.Color(244, 249, 249));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bản mã", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 24))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtKhoaKofBanMa.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel2.add(txtKhoaKofBanMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 372, 330, 45));

        txtBanMa.setColumns(20);
        txtBanMa.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtBanMa.setLineWrap(true);
        txtBanMa.setRows(5);
        txtBanMa.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtBanMa);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 42, 502, 304));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setText("Khóa dịch k");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 372, 149, 45));

        btnGiaiMa.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnGiaiMa.setText("Giải mã");
        btnGiaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaiMaActionPerformed(evt);
            }
        });
        jPanel2.add(btnGiaiMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 514, 106, 47));

        btnTaoKhoaNgauNhienofBanMa.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnTaoKhoaNgauNhienofBanMa.setText("Tạo khóa ngẫu nhiên");
        btnTaoKhoaNgauNhienofBanMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoKhoaNgauNhienofBanMaActionPerformed(evt);
            }
        });
        jPanel2.add(btnTaoKhoaNgauNhienofBanMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 428, -1, 49));

        btnChooseFileBanMa.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnChooseFileBanMa.setText("Đọc khóa từ File");
        btnChooseFileBanMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFileBanMaActionPerformed(evt);
            }
        });
        jPanel2.add(btnChooseFileBanMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 429, -1, 47));

        btnLuuKhoaBanMa.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnLuuKhoaBanMa.setText("Lưu khóa vào File");
        btnLuuKhoaBanMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuKhoaBanMaActionPerformed(evt);
            }
        });
        jPanel2.add(btnLuuKhoaBanMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 429, -1, 47));

        jPanel3.setBackground(new java.awt.Color(244, 249, 249));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bản rõ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 24))); // NOI18N

        txtBanRo.setColumns(20);
        txtBanRo.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtBanRo.setLineWrap(true);
        txtBanRo.setRows(5);
        txtBanRo.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtBanRo);

        txtKhoaKofBanRo.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        btnMaHoa.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnMaHoa.setText("Mã hóa");
        btnMaHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaHoaActionPerformed(evt);
            }
        });

        btnChooseFileBanRo.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnChooseFileBanRo.setText("Đọc khóa từ File");
        btnChooseFileBanRo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFileBanRoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setText("Khóa dịch k");

        btnTaoKhoaNgauNhienofBanRo.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnTaoKhoaNgauNhienofBanRo.setText("Tạo khóa ngẫu nhiên");
        btnTaoKhoaNgauNhienofBanRo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoKhoaNgauNhienofBanRoActionPerformed(evt);
            }
        });

        btnLuuKhoaBanRo.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnLuuKhoaBanRo.setText("Lưu khóa vào File");
        btnLuuKhoaBanRo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuKhoaBanRoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnTaoKhoaNgauNhienofBanRo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnChooseFileBanRo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLuuKhoaBanRo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(btnMaHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtKhoaKofBanRo, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(365, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(txtKhoaKofBanRo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaoKhoaNgauNhienofBanRo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseFileBanRo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuuKhoaBanRo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnMaHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(347, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(224, 224, 224)))
        );

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setText("HỆ MÃ SUBSTITUTION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(343, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(443, 443, 443))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(605, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 47, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 701));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaHoaActionPerformed
        // lay cac input tren man hinh
        String plainText = txtBanRo.getText();
        String key = txtKhoaKofBanRo.getText();
        String encryptedText = "";
        // khoi tao class SubstitutionCipher
        if (plainText.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập bản rõ", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        

        if (isKeyValid(key)) {
            encryptedText = encrypt(plainText, key);
        } else {
            JOptionPane.showMessageDialog(null, "Khóa không hợp lệ, vui lòng thử lại!");
        }

        txtBanMa.setText(encryptedText);
    }//GEN-LAST:event_btnMaHoaActionPerformed

    private void btnChooseFileBanRoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFileBanRoActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser("src/App/file/Substitution");
        int result = fileChooser.showOpenDialog(jPanel3);
        //SubstitutionCipher substitutionCipher = new SubstitutionCipher();

        readFile readFileText = new readFile();

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String key = readFileText.readTextFromFile(selectedFile.getPath());
            txtKhoaKofBanRo.setText(key.toUpperCase());
        }
        tempKeyofBanRo = txtKhoaKofBanRo.getText();


    }//GEN-LAST:event_btnChooseFileBanRoActionPerformed
    public static String decryptSubstitution(String text, String key, String plainText) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int index = key.indexOf(currentChar);

            if (index != -1) {
                char decryptedChar = plainText.charAt(index);
                decryptedText.append(decryptedChar);
            } else {
                decryptedText.append(currentChar); // Nếu không tìm thấy ký tự trong khóa, giữ nguyên ký tự đó
            }
        }

        return decryptedText.toString();
    }
    private void btnGiaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaiMaActionPerformed
        String cipherText = txtBanMa.getText(); // Lấy văn bản mã hóa từ giao diện
        String key = txtKhoaKofBanMa.getText(); // Lấy khóa từ giao diện
        String plainText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Bản rõ cố định
        String decryptedText = "";
        if (cipherText.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập bản mã", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (isKeyValid(key)) {
            decryptedText = decryptSubstitution(cipherText, key, plainText);
        } else {
            JOptionPane.showMessageDialog(null, "Khóa không hợp lệ, vui lòng thử lại!");
        }
        // Hiển thị kết quả lên giao diện
        txtBanRo.setText(decryptedText);
    }//GEN-LAST:event_btnGiaiMaActionPerformed

    private void btnTaoKhoaNgauNhienofBanRoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoKhoaNgauNhienofBanRoActionPerformed
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        // Tạo một bản sao của bảng chữ cái để làm khóa ban đầu
        char[] initialKey = Arrays.copyOf(alphabet, alphabet.length);

        // Tạo một đối tượng Random để tạo số ngẫu nhiên
        Random random = new Random();

        // Hoán đổi ngẫu nhiên các vị trí trong khóa ban đầu
        for (int i = 0; i < initialKey.length; i++) {
            int randomIndex = random.nextInt(initialKey.length);
            // Hoán đổi giá trị tại vị trí i và randomIndex
            char temp = initialKey[i];
            initialKey[i] = initialKey[randomIndex];
            initialKey[randomIndex] = temp;
        }

        // In ra khóa đã được tạo
        txtKhoaKofBanRo.setText(new String(initialKey));
        tempKeyofBanRo = txtKhoaKofBanRo.getText();
    }//GEN-LAST:event_btnTaoKhoaNgauNhienofBanRoActionPerformed

    private void btnLuuKhoaBanRoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuKhoaBanRoActionPerformed
        JFileChooser fileChooser = new JFileChooser("src/App/file/Substitution");
        int result = fileChooser.showSaveDialog(this); // this là JPanel hoặc JFrame chứa nút

        if (result == JFileChooser.APPROVE_OPTION) {
            // Lấy đường dẫn tệp được chọn bởi người dùng
            String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();

            // Lấy khóa từ trường text hoặc từ đâu đó trong ứng dụng
            String key = tempKeyofBanRo;
            try (FileWriter writer = new FileWriter(selectedFilePath + ".txt")) {
                writer.write(key);
                writer.close();
                JOptionPane.showMessageDialog(this, "Khóa đã được lưu vào " + selectedFilePath + ".txt", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi lưu khóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
            tempKeyofBanRo = "";
            txtKhoaKofBanRo.setText("");
        }
    }//GEN-LAST:event_btnLuuKhoaBanRoActionPerformed

    private void btnTaoKhoaNgauNhienofBanMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoKhoaNgauNhienofBanMaActionPerformed
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        // Tạo một bản sao của bảng chữ cái để làm khóa ban đầu
        char[] initialKey = Arrays.copyOf(alphabet, alphabet.length);

        // Tạo một đối tượng Random để tạo số ngẫu nhiên
        Random random = new Random();

        // Hoán đổi ngẫu nhiên các vị trí trong khóa ban đầu
        for (int i = 0; i < initialKey.length; i++) {
            int randomIndex = random.nextInt(initialKey.length);
            // Hoán đổi giá trị tại vị trí i và randomIndex
            char temp = initialKey[i];
            initialKey[i] = initialKey[randomIndex];
            initialKey[randomIndex] = temp;
        }

        // In ra khóa đã được tạo
        txtKhoaKofBanMa.setText(new String(initialKey));
        tempKeyofBanMa = txtKhoaKofBanMa.getText();
    }//GEN-LAST:event_btnTaoKhoaNgauNhienofBanMaActionPerformed

    private void btnChooseFileBanMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFileBanMaActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser("src/App/file/Substitution");
        int result = fileChooser.showOpenDialog(jPanel3);
        //SubstitutionCipher substitutionCipher = new SubstitutionCipher();

        readFile readFileText = new readFile();

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String key = readFileText.readTextFromFile(selectedFile.getPath());
            txtKhoaKofBanMa.setText(key.toUpperCase());
        }
        tempKeyofBanRo = txtKhoaKofBanMa.getText();
    }//GEN-LAST:event_btnChooseFileBanMaActionPerformed

    private void btnLuuKhoaBanMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuKhoaBanMaActionPerformed
        JFileChooser fileChooser = new JFileChooser("src/App/file/Substitution");
        int result = fileChooser.showSaveDialog(this); // this là JPanel hoặc JFrame chứa nút

        if (result == JFileChooser.APPROVE_OPTION) {
            // Lấy đường dẫn tệp được chọn bởi người dùng
            String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();

            // Lấy khóa từ trường text hoặc từ đâu đó trong ứng dụng
            String key = tempKeyofBanMa;
            try (FileWriter writer = new FileWriter(selectedFilePath + ".txt")) {
                writer.write(key);
                writer.close();
                JOptionPane.showMessageDialog(this, "Khóa đã được lưu vào " + selectedFilePath + ".txt", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi lưu khóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
            tempKeyofBanMa = "";
            txtKhoaKofBanMa.setText("");
        }
    }//GEN-LAST:event_btnLuuKhoaBanMaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseFileBanMa;
    private javax.swing.JButton btnChooseFileBanRo;
    private javax.swing.JButton btnGiaiMa;
    private javax.swing.JButton btnLuuKhoaBanMa;
    private javax.swing.JButton btnLuuKhoaBanRo;
    private javax.swing.JButton btnMaHoa;
    private javax.swing.JButton btnTaoKhoaNgauNhienofBanMa;
    private javax.swing.JButton btnTaoKhoaNgauNhienofBanRo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtBanMa;
    private javax.swing.JTextArea txtBanRo;
    private javax.swing.JTextField txtKhoaKofBanMa;
    private javax.swing.JTextField txtKhoaKofBanRo;
    // End of variables declaration//GEN-END:variables
}
