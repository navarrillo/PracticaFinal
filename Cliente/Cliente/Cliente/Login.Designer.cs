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
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(180, 142);
            this.label1.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(46, 17);
            this.label1.TabIndex = 0;
            this.label1.Text = "Email:";
            // 
            // tb_email_login
            // 
            this.tb_email_login.Location = new System.Drawing.Point(300, 142);
            this.tb_email_login.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.tb_email_login.Name = "tb_email_login";
            this.tb_email_login.Size = new System.Drawing.Size(132, 22);
            this.tb_email_login.TabIndex = 1;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(184, 188);
            this.label2.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(85, 17);
            this.label2.TabIndex = 2;
            this.label2.Text = "Contraseña:";
            // 
            // tb_pass_login
            // 
            this.tb_pass_login.Location = new System.Drawing.Point(300, 188);
            this.tb_pass_login.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.tb_pass_login.Name = "tb_pass_login";
            this.tb_pass_login.Size = new System.Drawing.Size(132, 22);
            this.tb_pass_login.TabIndex = 3;
            // 
            // btn_iniciarSesion
            // 
            this.btn_iniciarSesion.Location = new System.Drawing.Point(300, 267);
            this.btn_iniciarSesion.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.btn_iniciarSesion.Name = "btn_iniciarSesion";
            this.btn_iniciarSesion.Size = new System.Drawing.Size(131, 28);
            this.btn_iniciarSesion.TabIndex = 4;
            this.btn_iniciarSesion.Text = "Iniciar Sesión";
            this.btn_iniciarSesion.UseVisualStyleBackColor = true;
            this.btn_iniciarSesion.Click += new System.EventHandler(this.btn_iniciarSesion_Click);
            // 
            // Login
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(759, 448);
            this.Controls.Add(this.btn_iniciarSesion);
            this.Controls.Add(this.tb_pass_login);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.tb_email_login);
            this.Controls.Add(this.label1);
            this.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
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
    }
}