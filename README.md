# SMV-03_Activities_2
1. Odpre drug Activity brez prenosa parametrov iz prvega.

2. Prenos parametrov na drug activity, puščica za nazaj, zaganjanje poljubnega activityja

Da lahko direktno poženemo neko aktivnost, je treba v manifest v njen dodati android:exported="true", potem pa lahko v Run / Edit configurations izberemo to aktivnost.

Da lahko iz neke aktivnosti pridemo nazaj v prejšnjo s puščico levo zgoraj (ActionBar), je treba v manifest v njen dodati android:parentActivityName=".ImeStarševkegaAktivitija"
