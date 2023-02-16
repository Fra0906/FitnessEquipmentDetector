# Object Detection with YOLOv5 on Android
# FitnessEquipmentDetecor_APP

## Prerequisiti

* PyTorch 1.9.0 or later (Optional)
* TorchVision 0.10.0
* Python 3.8 (Optional)
* Android Pytorch library pytorch_android_lite:1.9.0 and pytorch_android_torchvision:1.9.0
* Android Studio 4.0.1 or later


### 1. Creazione del modello

Se utilizzi una versione diversa di PyTorch per creare il tuo modello seguendo le istruzioni seguenti, assicurati di specificare la stessa versione della libreria PyTorch Android nel file `build.gradle` per evitare possibili errori causati dalla mancata corrispondenza della versione.

Lo script Python `export.py` è usato per generale un modello useTorchScript-formatted YOLOv5 chiamato `best.torchscript.ptl` per applicazioni mobili.

Da terminale, recati nella cartella yolov5 e modifica il file `export.py` con le seguenti modifiche:

* Dopo la riga di codice `f = file.with_suffix('.torchscript.pt')`, aggiungi: ` fl = file.with_suffix('.torchscript.ptl') `

* Dopo la riga di codice `(optimize_for_mobile(ts) if optimize else ts).save(f)`, aggiungi: `(optimize_for_mobile(ts) if optimize else ts)._save_for_lite_interpreter(str(fl))`



Ora esegui lo script per generare il modello TorchScript ottimizzato e copia il file del modello generato `best.torchscript.ptl` nella cartella `FitnessEquipmentDetector_APP/app/src/main/assets`:

```
python export.py --weights best.pt --include torchscript
```
<br>

Nella cartella al percorso `FitnessEquipmentDetector_APP/app/src/main/assets`, oltre al modello `best.totchscript.ptl`, crea un file di testo *classes.txt* contenente i nomi delle classi prese in considerazioni nel modello. <br>
<br>


### 2. Android Studio

Start Android Studio, dopo apri il progetto in `FitnessEquipmentDetector_APP`

### 3. Esegui l'applicazione

Seleziona un emulatore android o un dispositivo android collegato per eseguire l'applicazione.

<br>

### 4. Interfaccia grafica

i. Schermata home: <br>
<img src="/images1/2.png"> <br><br>

ii. Lista attrezzi: <br>
<img src="/images2/2.png"> <br>



Cliccando su ogni attrezzo si apre una schermata che mostra informazioni utili riguardanti l'attrezzo, benefici e consigli utili. Vengonoa anche proposti degli esempi di esercizi da poter svolgere con l'attrezzo: <br>
<img src="/images2/3.png"> <br><br>


iii. Start: <br>
<img src="/images2/4.png"> <br><br>

