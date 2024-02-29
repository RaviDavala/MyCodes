import pyttsx3
import speech_recognition as sr
import webbrowser
import os
import random
from datetime import datetime

def get_time_of_day():
    current_hour = datetime.now().hour
    if 5 <= current_hour < 12:
        return "morning"
    elif 12 <= current_hour < 17:
        return "afternoon"
    else:
        return "evening"

#def get_available_voices():
#    engine = pyttsx3.init()
#    voices = engine.getProperty('voices')
#    for voice in voices:
#        print(f"ID: {voice.id}, Name: {voice.name}, Lang: {voice.languages}")

Friday = 'Zira'
Jarvis = 'David'
randomly_selected_voice = random.choice([Friday, Jarvis])

if randomly_selected_voice == 'David':
    voice_name = "Jarvis"
    wake_word = "jarvis"
else:
    voice_name = "Friday"
    wake_word = "friday"

def speak(text):
    engine = pyttsx3.init()
    for voice in engine.getProperty('voices'):

        if randomly_selected_voice.lower() in voice.name.lower():
            engine.setProperty('voice', voice.id)
    engine.say(text)
    engine.runAndWait()

def voice_change(voice1, voice_name1):
    global randomly_selected_voice, voice_name
    global wake_word
    speak(f"forwarding to {voice_name1}")
    randomly_selected_voice = voice1
    voice_name = voice_name1
    if voice_name1 == "Friday":
        wake_word = "friday"
    else:
        wake_word = "jarvis"
    speak(f"Yeah {user_name}?")

def user_name_change():
    speak("Ok, what is the new user name?")
    global user_name
    user_name = listen().lower()
    user_name = user_name.split("is", 1)[-1].strip()
    speak(f"DONE!, user got changed to {user_name}. Anything more you need?")
    if "ravi" in user_name:
      user_name = "BOSS"

def listen():
    recognizer = sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening for wake-up word...")
        recognizer.adjust_for_ambient_noise(source, duration=1)
        audio = recognizer.listen(source)

    try:
        print("Recognizing...")
        wake_up_word = recognizer.recognize_google(audio).lower()
        print(f"Detected wake-up word: {wake_up_word}")
        return wake_up_word
    except sr.UnknownValueError:
        return ""

chrome_path = "C:\Program Files\Google\Chrome\Application\chrome.exe"  # Adjust the path accordingly
webbrowser.register('chrome', None, webbrowser.BackgroundBrowser(chrome_path))

def open_notepad():
    os.system("C:\\Windows\\System32\\notepad.exe")
    speak("Opening Notepad.")
    speak("Anything Else?")

def open_chrome():
    os.system("start chrome")
    speak("Opening Google Chrome.")
    speak("and Anything else?")

def open_calculator():
    os.system("start calc")
    speak("Opening Calculator.")
    speak("what Else?")

def open_file_explorer():
    os.system("start explorer")
    speak("Opening File Explorer.")
    speak("Anything Else?")

def open_edge():
    os.system("start microsoft-edge:")
    speak("Opening Microsoft Edge.")
    speak("Anything Else?")

def open_command_prompt():
    os.system("start cmd")
    speak("Opening Command Prompt.")
    speak("Anything Else?")

def tell_time():
    current_time = datetime.now().strftime("%H:%M")
    speak(f"The current time is {current_time}.")

def shutdown():
    speak(f"Are you sure you want to shut down your laptop?")
    response = listen().lower()

    if "yes" in response:
        speak("Ok, Shutting down your laptop. Goodbye!")
        exit_code = 0
        os.system("shutdown /s /t 1")
    else:
        speak("Cancelling shutdown. What now?")

def websites(link, name):
    speak(f"Opening {name}")
    webbrowser.get("chrome").open(link, new=2)
    speak("Anything else?")

def google_search(query):
    url = f"https://www.google.com/search?q={query}"
    webbrowser.open(url)
    speak(f"Searching Google for {query}.")
    speak(f"Do you need anything more {user_name}?")

if __name__ == "__main__":
    time_of_day = get_time_of_day()
    speak(f"GOOD {time_of_day}!, May i know your name please?")

#Setting the user name
    user_name = listen().lower()
    user_name = user_name.split("is", 1)[-1].strip()
    if 'boss' in user_name or 'ravi' in user_name:
        speak("Hi BOSS!")
        user_name = 'BOSS!'
    else:
        speak(f"THANKS! {user_name}")

    exit_code = 1
    while exit_code == 1:
        # Continuously listen for the wake-up word
        detected_word = listen().lower()
 
        if "101" in detected_word:
            speak(f"{voice_name} going DOWN!")
            break  # Exit the outer loop

        if "get" in detected_word or "switch back" in detected_word or "fetch" in detected_word or "need" in detected_word:
            if "friday" in detected_word:
              voice = 'Zira'
              voice_name = 'Friday'
              voice_change(voice, voice_name)
            elif "jarvis" in detected_word:
              voice = 'David'
              voice_name = 'Jarvis'
              voice_change(voice, voice_name)
            continue
        
        if 'jarvis' in detected_word and wake_word == 'friday':
            speak(f"Its me..{user_name}!, FRIDAY")

        elif 'friday' in detected_word and wake_word == 'jarvis':
            speak(f"Its me..{user_name}!, JARVIS")

        elif wake_word in detected_word:
            speak(f"YES {user_name}?")

            while True:
                command = listen().lower()

                if "no thanks" in command or "mute" in command:
                    speak("OK..., Bye!")
                    break

                elif "thanks" in command:
                    speak("My Pleasure!. Do you need anything more?")
                    continue

                elif "101" in command:
                    speak(f"{voice_name} going Down!")
                    exit_code = 0  # Setting exit_code to 0 to break out of the outer loop
                    break
                
                elif "get" in command or "switch back" in command or "fetch" in command or "need" in command:
                    if "friday" in command:
                      voice = 'Zira'
                      voice_name = 'Friday'
                      voice_change(voice, voice_name)
                    else:
                      voice = 'David'
                      voice_name = 'Jarvis'
                      voice_change(voice, voice_name)
                      speak("Tell me, what do you need?")
                    continue

                elif "change" in command and "username" in command:
                    user_name_change()

                # Add your custom commands and responses here
                elif "hello" in command or "hi" in command or "hey" in command:
                    speak(f"Hi {user_name}!")

                elif "how are you" in command or "how r u" in command:
                    speak("I'm doing well, THANK YOU!")

                elif "open notepad" in command:
                    open_notepad()

                elif "open wordpad" in command:
                   speak("Opening word Pad....... Anything else?")
                   os.system('start write')

                elif "open chrome" in command:
                    open_chrome()

                elif "open calculator" in command:
                    open_calculator()

                elif "open file explorer" in command:
                    open_file_explorer()

                elif "open edge" in command:
                    open_edge()

                elif "open code" in command or "open visual studio code" in command:
                    speak("Opening Vs Code. Anything else?")
                    os.system("code")

                elif "open mails" in command or "open mail" in command or "open mailbox" in command:
                    speak("Opening Mail Box. Anything else?")
                    os.system("start outlook:")

                elif "local movies" in command:
                    speak("Opening Movies....... Anything else?")
                    folder_path = r"D:\movies"
                    os.system(f'explorer "{folder_path}"')

                elif "open terminal" in command:
                    open_command_prompt()
                
                elif "kill power" in command:
                    shutdown()
                    break

                elif "what" in command and "time" in command:
                    tell_time()

                elif "google" in command:
                    query = command.split("google for", 1)[-1].strip()
                    if query:
                        google_search(query)
                    else:
                        speak("What would you like me to search on Google?")

                elif "youtube" in command:
                    link1=f"https://www.youtube.com/"
                    name1="Youtube"
                    websites(link1, name1)

                elif "netflix" in command:
                    link1=f"https://www.netflix.com/browse"
                    name1="Netflix"
                    websites(link1, name1)

                elif "anime watch" in command:
                    link1=f"https://aniwatch.to/"
                    name1="Aniwatch"
                    websites(link1, name1)
                
                elif "chat gpt" in command:
                    link1=f"https://chat.openai.com/"
                    name1="Chat G P T"
                    websites(link1, name1)

                elif "whatsapp" in command:
                    link1=f"https://web.whatsapp.com/"
                    name1="Whats app"
                    websites(link1, name1)

                elif "instagram" in command:
                    link1=f"https://www.instagram.com/"
                    name1="Instagram"
                    websites(link1, name1)

                elif "lms" in command:
                    link1=f"https://student.onlinemanipal.com/s/"
                    name1="Student Portal"
                    websites(link1, name1)

                else:
                    speak("Guess i cannot do that!")
