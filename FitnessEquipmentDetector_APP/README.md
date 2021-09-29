# Object Detection with YOLOv5 on Android

## Prerequisiti

* PyTorch 1.9.0 or later (Optional)
* Python 3.8 (Optional)
* Android Pytorch library pytorch_android_lite:1.9.0 and pytorch_android_torchvision:1.9.0
* Android Studio 4.0.1 or later


### 1. Creazione del modello

Se utilizzi una versione diversa di PyTorch per creare il tuo modello seguendo le istruzioni seguenti, assicurati di specificare la stessa versione della libreria PyTorch Android nel file `build.gradle` per evitare possibili errori causati dalla mancata corrispondenza della versione.

Lo script Python `export.py` nella cartella `models` è usata per generale un modello useTorchScript-formatted YOLOv5 chiamato `best.torchscript.pt` per applicazioni mobili.

Da terminale, recati nella cartella yolov5 e modifica il file `export.py` con le seguenti modifiche:

* cambia la riga 50 da `model.model[-1].export = True` to `model.model[-1].export = False`

* Cambia la riga 56 da `f = opt.weights.replace('.pt', '.torchscript.pt')` to `f = opt.weights.replace('.pt', '.torchscript.ptl')`

* aggiungi le seguenti due righe dopo la linea 57 tra  `ts = torch.jit.trace(model, img)` e `ts.save(f)`:

```
    from torch.utils.mobile_optimizer import optimize_for_mobile        
    ts = optimize_for_mobile(ts)    
```

* Sostituisci la riga `ts.save(f)` con `ts._save_for_lite_interpreter(f)`.



Ora esegui lo script per generare il modello TorchScript ottimizzato e copia il file del modello generato `best.torchscript.ptl` nella cartella `FitnessEquipmentDetector_APP/app/src/main/assets`:

```
python export.py --weights best.pt
```


### 2. Android Studio

Start Android Studio, dopo apri il progetto in `FitnessEquipmentDetector_APP`

### 3. Esegui l'applicazione

Seleziona un emulatore android o un dispositivo android collegato per eseguire l'applicazione.



