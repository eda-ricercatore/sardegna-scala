Prof. Theodora Chaspari

Knowledge-driven representations of physiological (bio-behavioral) signals: Developing measurable indices of non-observable behavior

Mathematical models for applictions in: 
+ health care
	- mental well-beging
	- physical well-being  
	- social well-being

Human behavior is related to health.

Mathematical models can lead to the prediction of health outcomes.
+ Overt behavioral cues
+ Covert biosignals
+ Interacting environment





Overt behavioral cues:
+ speech & language
+ facial expression
+ body posture and gestures

Covert biosignals
+ heart activities
+ brain activities
+ respiration

Interacting environment
+ social interactions
+ environmental factors


behavioral signal information, and covert biomarkers
wearable technologies, wearable computing
IoT devices can provide information about the environment
+ GPS information
	- time spent outside,
	- standard of living, time spent working,
+ monitor weight, nutrition intake
+ access genomics data set	 

Big data versus finite human resources (needed to interpret data).
+ noise,  high-frequency noise + other noise
+ measurable indices

Design and learn representations of knowledge (noise + measurable indices)
Translate representations to meaningful applications  (measurable indices + interpretation)

design, learn, translate, inform

electrodermal activity (EDA)
electrocardiogram (ECG)

relationship between EDA (and ECG) to physical/mental health

Characteristic structure...

Signal morphology, create parametric dictionaries

sparse decomposition
+ matching pursuit
+ early stopping
+ orthogonal matching pursuit

parametric dictionaries (collection of timed tonic atoms)
+ signal-specific
+ high signal variability
+ physical interpretation

EDA
+ tonic atoms, linear model
+ phasic atoms, nonlinear model (exponential decay)

ECG
+ QRS atoms
+ zero-order "hermite" atoms



Different physical problems use different atoms for composition, during modeling
normal beat
premature ventricular contraction
paced beat

identify abnormalities in heart beats
least-squares fit
raw signal

signal reconstruction error, compression rate, beat classification

unweighted accuracy, Daubechies

convolutional sparse coding, via estimating time shifts
hardware implementation of sparse decomposition
each step of OMP can be parallized


unified model of physiological signals 
sparse representation
+ low dimensionality structure preservation

Bayesian framework

dictionary learning, DL
deterministic non-parametric DL
deterministic parametric DL

Bayesian/statistical approach
+ Bayesian framework
+ MCMC
+ parallelizable


Hadamard (entrywise) product, used to facilitate problem formulation
probabilistic assumptions
Wallenius distribution, multi-nomial distribution
Normal distribution

don't use complicated closed form solution, use approximate solution instead

block-at-a-time MCMC sampling

synthetic signals, real signals
K-SVD, K-singular value decomposition

computational limitations
+ variational approximation approach
+ full posterior estimations
	-denoising


real-life bio-behavioral monitoring
+ physiological spectrograms for stress
+ physiological synchrony quantification
+ multimodal ambulatory detection of interpersonal conflict
+ promoting engagement in child-robot interaction (model speech patterns)

interpersonal conflict 
+ conflict detection system
+ data collection
+ multimodal feature design
+ multimodal fusion

ambulatory feature design
+ EDA
+ ECG
+ self-reports (subjective)
+ physiological synchrony
+ acoustic analysis
+ language usage
+ context interaction

different ML (machine learning) systems
+ decision-level fusion
+ feature-level fusion

multimodal features + self-report > multimodal features > self-report

ROC curves, receiver operating characteristic curves




















































