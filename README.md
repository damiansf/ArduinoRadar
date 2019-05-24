Code to go with hardware radar system

Sketch_may27a is arduino code
radar_code_v2 is code for processing ( Download link :https://www.processing.org/download/?processing )

Arduino code gathers data from HCSR04 and also gathers data of the servo's location. The data is displayed in the serial box.(distance,servo location)
The processing code takes the HCR04 data from the arduino code along with the servo location code. It transmits the data into new plotable values and plots them on the screen. Any key can be pressed to refresh the screen. Graphical glitches are common.
