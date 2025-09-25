import matplotlib.pyplot as plt
import seaborn as sns
import pandas as pd

# 🔢 Données filtrées (sans MAPE)
data = {
    "Modèle": ["LSTM", "LSTM", "ARIMA", "ARIMA", "Persistance", "Persistance",
               "LSTM", "LSTM", "ARIMA", "ARIMA", "Persistance", "Persistance"],
    "Variable": ["Température", "Température", "Température", "Température", "Température", "Température",
                 "Précipitation", "Précipitation", "Précipitation", "Précipitation", "Précipitation", "Précipitation"],
    "Métrique": ["MAE", "RMSE"] * 6,
    "Valeur": [
        0.63, 0.84,     # LSTM Temp
        2.29, 2.49,     # ARIMA Temp
        1.67, 1.80,     # Persistance Temp
        0.94, 1.38,     # LSTM Prec
        0.36, 0.41,     # ARIMA Prec
        1.11, 1.50      # Persistance Prec
    ]
}

df = pd.DataFrame(data)

# 🎨 Barplot groupé
plt.figure(figsize=(10, 6))
sns.barplot(data=df, x="Modèle", y="Valeur", hue="Métrique", palette="Set2", ci=None)

plt.title("Comparaison MAE et RMSE par modèle", fontsize=14)
plt.ylabel("Erreur")
plt.xlabel("Modèle")
plt.legend(title="Métrique")
plt.tight_layout()

# 💾 Sauvegarde
plt.savefig("comparaison_MAE_RMSE.png", dpi=300)
plt.show()