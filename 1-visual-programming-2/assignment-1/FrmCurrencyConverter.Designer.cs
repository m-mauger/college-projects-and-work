namespace Assignment1UserInterface
{
    partial class FrmCurrencyConverter
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
            this.lblAppTitle = new System.Windows.Forms.Label();
            this.lblEnterAmountToConvert = new System.Windows.Forms.Label();
            this.txtUSAmount = new System.Windows.Forms.TextBox();
            this.btnAUD = new System.Windows.Forms.Button();
            this.btnCNY = new System.Windows.Forms.Button();
            this.btnEUR = new System.Windows.Forms.Button();
            this.btnGBP = new System.Windows.Forms.Button();
            this.btnJPY = new System.Windows.Forms.Button();
            this.lblUSEquivalentInForeignCurrency = new System.Windows.Forms.Label();
            this.lblCurrencyResult = new System.Windows.Forms.Label();
            this.btnClear = new System.Windows.Forms.Button();
            this.btnExitApplication = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lblAppTitle
            // 
            this.lblAppTitle.AutoSize = true;
            this.lblAppTitle.BackColor = System.Drawing.Color.Beige;
            this.lblAppTitle.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.lblAppTitle.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblAppTitle.Location = new System.Drawing.Point(100, 9);
            this.lblAppTitle.Name = "lblAppTitle";
            this.lblAppTitle.Size = new System.Drawing.Size(290, 22);
            this.lblAppTitle.TabIndex = 0;
            this.lblAppTitle.Text = "Currency Converter by Matthew Mauger";
            // 
            // lblEnterAmountToConvert
            // 
            this.lblEnterAmountToConvert.AutoSize = true;
            this.lblEnterAmountToConvert.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblEnterAmountToConvert.Location = new System.Drawing.Point(12, 78);
            this.lblEnterAmountToConvert.Name = "lblEnterAmountToConvert";
            this.lblEnterAmountToConvert.Size = new System.Drawing.Size(232, 18);
            this.lblEnterAmountToConvert.TabIndex = 1;
            this.lblEnterAmountToConvert.Text = "Enter Amount in US $ To Convert:";
            // 
            // txtUSAmount
            // 
            this.txtUSAmount.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtUSAmount.Location = new System.Drawing.Point(250, 77);
            this.txtUSAmount.Name = "txtUSAmount";
            this.txtUSAmount.Size = new System.Drawing.Size(164, 21);
            this.txtUSAmount.TabIndex = 2;
            this.txtUSAmount.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            // 
            // btnAUD
            // 
            this.btnAUD.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnAUD.Location = new System.Drawing.Point(44, 139);
            this.btnAUD.Name = "btnAUD";
            this.btnAUD.Size = new System.Drawing.Size(75, 29);
            this.btnAUD.TabIndex = 3;
            this.btnAUD.Text = "AUD";
            this.btnAUD.UseVisualStyleBackColor = true;
            this.btnAUD.Click += new System.EventHandler(this.PerformCurrencyConversionBasedOnButtonClicked);
            // 
            // btnCNY
            // 
            this.btnCNY.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCNY.Location = new System.Drawing.Point(125, 139);
            this.btnCNY.Name = "btnCNY";
            this.btnCNY.Size = new System.Drawing.Size(75, 29);
            this.btnCNY.TabIndex = 4;
            this.btnCNY.Text = "CNY";
            this.btnCNY.UseVisualStyleBackColor = true;
            this.btnCNY.Click += new System.EventHandler(this.PerformCurrencyConversionBasedOnButtonClicked);
            // 
            // btnEUR
            // 
            this.btnEUR.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnEUR.Location = new System.Drawing.Point(206, 139);
            this.btnEUR.Name = "btnEUR";
            this.btnEUR.Size = new System.Drawing.Size(75, 29);
            this.btnEUR.TabIndex = 5;
            this.btnEUR.Text = "EUR";
            this.btnEUR.UseVisualStyleBackColor = true;
            this.btnEUR.Click += new System.EventHandler(this.PerformCurrencyConversionBasedOnButtonClicked);
            // 
            // btnGBP
            // 
            this.btnGBP.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnGBP.Location = new System.Drawing.Point(287, 139);
            this.btnGBP.Name = "btnGBP";
            this.btnGBP.Size = new System.Drawing.Size(75, 29);
            this.btnGBP.TabIndex = 6;
            this.btnGBP.Text = "GBP";
            this.btnGBP.UseVisualStyleBackColor = true;
            this.btnGBP.Click += new System.EventHandler(this.PerformCurrencyConversionBasedOnButtonClicked);
            // 
            // btnJPY
            // 
            this.btnJPY.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnJPY.Location = new System.Drawing.Point(368, 139);
            this.btnJPY.Name = "btnJPY";
            this.btnJPY.Size = new System.Drawing.Size(75, 29);
            this.btnJPY.TabIndex = 7;
            this.btnJPY.Text = "JPY";
            this.btnJPY.UseVisualStyleBackColor = true;
            this.btnJPY.Click += new System.EventHandler(this.PerformCurrencyConversionBasedOnButtonClicked);
            // 
            // lblUSEquivalentInForeignCurrency
            // 
            this.lblUSEquivalentInForeignCurrency.AutoSize = true;
            this.lblUSEquivalentInForeignCurrency.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblUSEquivalentInForeignCurrency.Location = new System.Drawing.Point(12, 204);
            this.lblUSEquivalentInForeignCurrency.Name = "lblUSEquivalentInForeignCurrency";
            this.lblUSEquivalentInForeignCurrency.Size = new System.Drawing.Size(249, 18);
            this.lblUSEquivalentInForeignCurrency.TabIndex = 8;
            this.lblUSEquivalentInForeignCurrency.Text = "US $ Equivalent in Foreign Currency:";
            // 
            // lblCurrencyResult
            // 
            this.lblCurrencyResult.BackColor = System.Drawing.Color.Beige;
            this.lblCurrencyResult.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.lblCurrencyResult.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCurrencyResult.Location = new System.Drawing.Point(267, 205);
            this.lblCurrencyResult.Name = "lblCurrencyResult";
            this.lblCurrencyResult.Size = new System.Drawing.Size(256, 22);
            this.lblCurrencyResult.TabIndex = 9;
            // 
            // btnClear
            // 
            this.btnClear.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnClear.Location = new System.Drawing.Point(144, 255);
            this.btnClear.Name = "btnClear";
            this.btnClear.Size = new System.Drawing.Size(75, 29);
            this.btnClear.TabIndex = 10;
            this.btnClear.Text = "Clear";
            this.btnClear.UseVisualStyleBackColor = true;
            this.btnClear.Click += new System.EventHandler(this.BtnClear_Click);
            // 
            // btnExitApplication
            // 
            this.btnExitApplication.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnExitApplication.Location = new System.Drawing.Point(250, 255);
            this.btnExitApplication.Name = "btnExitApplication";
            this.btnExitApplication.Size = new System.Drawing.Size(121, 29);
            this.btnExitApplication.TabIndex = 11;
            this.btnExitApplication.Text = "Exit Application";
            this.btnExitApplication.UseVisualStyleBackColor = true;
            this.btnExitApplication.Click += new System.EventHandler(this.BtnExitApplication_Click);
            // 
            // FrmCurrencyConverter
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(541, 325);
            this.Controls.Add(this.btnExitApplication);
            this.Controls.Add(this.btnClear);
            this.Controls.Add(this.lblCurrencyResult);
            this.Controls.Add(this.lblUSEquivalentInForeignCurrency);
            this.Controls.Add(this.btnJPY);
            this.Controls.Add(this.btnGBP);
            this.Controls.Add(this.btnEUR);
            this.Controls.Add(this.btnCNY);
            this.Controls.Add(this.btnAUD);
            this.Controls.Add(this.txtUSAmount);
            this.Controls.Add(this.lblEnterAmountToConvert);
            this.Controls.Add(this.lblAppTitle);
            this.Name = "FrmCurrencyConverter";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Currency Converter";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblAppTitle;
        private System.Windows.Forms.Label lblEnterAmountToConvert;
        private System.Windows.Forms.TextBox txtUSAmount;
        private System.Windows.Forms.Button btnAUD;
        private System.Windows.Forms.Button btnCNY;
        private System.Windows.Forms.Button btnEUR;
        private System.Windows.Forms.Button btnGBP;
        private System.Windows.Forms.Button btnJPY;
        private System.Windows.Forms.Label lblUSEquivalentInForeignCurrency;
        private System.Windows.Forms.Label lblCurrencyResult;
        private System.Windows.Forms.Button btnClear;
        private System.Windows.Forms.Button btnExitApplication;
    }
}

