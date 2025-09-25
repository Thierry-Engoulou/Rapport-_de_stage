import matplotlib.pyplot as plt

# Données de bénéfice net en milliards FCFA
annees = ["2021", "2022", "2023", "2024"]
benefices = [22.6, 16.1, 14.4, 12.5]

# Création du graphique
plt.figure(figsize=(8,5))
bars = plt.bar(annees, benefices, color='steelblue', edgecolor='black')

# Ajouter les valeurs au-dessus de chaque barre
for bar in bars:
    yval = bar.get_height()
    plt.text(bar.get_x() + bar.get_width()/2, yval + 0.5, f'{yval:.1f}', ha='center', fontsize=10)

plt.title("Évolution du bénéfice net du PAD (2021–2024)")
plt.ylabel("Bénéfice net (en milliards FCFA)")
plt.xlabel("Année")
plt.ylim(0, max(benefices) + 5)
plt.grid(axis='y', linestyle='--', alpha=0.7)

plt.tight_layout()
plt.show()