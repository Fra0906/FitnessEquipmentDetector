# FitnessEquipmentDetector

Link al repository ufficiale di yolov5: https://github.com/ultralytics/yolov5 <br>
Link al datset utilizzato: https://drive.google.com/drive/folders/1zjil5UGwYDGZs2xewSqFMS-Y7PSqzbD_?usp=sharing <br>

# Creazione del dataset

Dataset formato da:
- 35 imamgini per la classe Ball;
- 35 imamgini per la classe Box;
- 35 imamgini per la classe Gym Weights;
- 35 imamgini per la classe Lat Machine;
- 35 imamgini per la classe Kettleball;
- 35 imamgini per la classe Step;
- 35 immagini per la classe Punching Bag.

Le immagini sono divise in tre cartelle: train (70%), valid (20%) e test (10%). <br>
Tutte le immagini sono state etichettate manualmente attraverso la piattaforma Roboflow Annotate: https://blog.roboflow.com/labelimg/. <br>
Dopo la fase di preprocessing e dopo aver applicato degli aumenti, esportiamo il modello nel formato *YOLOv5 PyTorch*.

# Fase di training

Per prima cosa occorre copiare il file esportato nella cartella *data/dataset* del progetto. <br>
La cartella dataset, conterrà tre cartelle: *test,train,valid* contenenti a lro volta le cartelle *labels* e *images*. <br><br>

Creiamo quindi il nostro file di configurazione *data.yaml* e lo inseriamo nella cartella *data/dataset*.<br>
Il file contiene il path del dataset, della cartella valid,train e test; il numero delle classi comn i realtivi nomi: <br><br>
                              *path:  .../data/dataset<br>
                              valid:  .../data/dataset/valid/images<br>
                              train:  .../data/dataset/train/images<br>
                              test:   .../data/dataset/test/images<br>*
          
