# Creando un Data Frame
plaindf = data.frame(
    names = c("Martin", "Elisa"),
    debts = c(100, 200))
    
str(plaindf)

# Accediendo a las columnas del data frame
plaindf[1]

# Accediendo a la primera fila
plaindf[1, ]

# leyendo archivos .csv (ruta absoluta)
df = read.csv("/Users/mrgoonies/Downloads/airtravel.csv")


# Visualizando el archivo csv
View(df)

# Obteniendo averange de una fila 
mean(df[,2])
