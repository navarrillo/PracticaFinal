namespace Cliente
{
    partial class Login
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.tb_email_login = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.tb_pass_login = new System.Windows.Forms.TextBox();
            this.btn_iniciarSesion = new System.Windows.Forms.Button();
            this.Reserva = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(135, 115);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(35, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Email:";
            // 
            // tb_email_login
            // 
            this.tb_email_login.Location = new System.Drawing.Point(225, 115);
            this.tb_email_login.Name = "tb_email_login";
            this.tb_email_login.Size = new System.Drawing.Size(100, 20);
            this.tb_email_login.TabIndex = 1;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(138, 153);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(64, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Contraseña:";
            // 
            // tb_pass_login
            // 
            this.tb_pass_login.Location = new System.Drawing.Point(225, 153);
            this.tb_pass_login.Name = "tb_pass_login";
            this.tb_pass_login.Size = new System.Drawing.Size(100, 20);
            this.tb_pass_login.TabIndex = 3;
            // 
            // btn_iniciarSesion
            // 
            this.btn_iniciarSesion.Location = new System.Drawing.Point(184, 217);
            this.btn_iniciarSesion.Name = "btn_iniciarSesion";
            this.btn_iniciarSesion.Size = new System.Drawing.Size(98, 23);
            this.btn_iniciarSesion.TabIndex = 4;
            this.btn_iniciarSesion.Text = "Iniciar Sesión";
            this.btn_iniciarSesion.UseVisualStyleBackColor = true;
            this.btn_iniciarSesion.Click += new System.EventHandler(this.btn_iniciarSesion_Click);
            // 
            // Reserva
            // 
            this.Reserva.Location = new System.Drawing.Point(377, 90);
            this.Reserva.Name = "Reserva";
            this.Reserva.Size = new System.Drawing.Size(139, 111);
            this.Reserva.TabIndex = 5;
            this.Reserva.Text = "Realizar Reserva";
            this.Reserva.UseVisualStyleBackColor = true;
            this.Reserva.Click += new System.EventHandler(this.Reserva_Click);
            // 
            // Login
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(569, 364);
            this.Controls.Add(this.Reserva);
            this.Controls.Add(this.btn_iniciarSesion);
            this.Controls.Add(this.tb_pass_login);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.tb_email_login);
            this.Controls.Add(this.label1);
            this.Name = "Login";
            this.Text = "Login";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox tb_email_login;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox tb_pass_login;
        private System.Windows.Forms.Button btn_iniciarSesion;
        private System.Windows.Forms.Button Reserva;
    }
}