![Cobweb Mod Template banner](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/cobweb-mod-template/banner.gif "Cobweb Mod Template banner")

---
![Minecraft](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/minecraft/minecraft.svg)[![1.20.4](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/minecraft/1-20-4.svg)](https://modrinth.com/mod/cobweb-mod-template/versions?g=1.20.4)![Separator](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/separator.svg)[![1.20.2](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/minecraft/1-20-2.svg)](https://modrinth.com/mod/cobweb-mod-template/versions?g=1.20.2)![Separator](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/separator.svg)[![1.19.4](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/minecraft/1-19-4.svg)](https://modrinth.com/mod/cobweb-mod-template/versions?g=1.19.4)![Separator](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/separator.svg)[![1.19.2](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/minecraft/1-19-2.svg)](https://modrinth.com/mod/cobweb-mod-template/versions?g=1.19.2)![Separator](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/separator.svg)[![1.18.2](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/minecraft/1-18-2.svg)](https://modrinth.com/mod/cobweb-mod-template/versions?g=1.18.2)

![Loader](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/loader/loader.svg)[![NeoForge](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/loader/neoforge.svg)](https://modrinth.com/mod/cobweb-mod-template/versions?l=neoforge)![Separator](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/separator.svg)[![Forge](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/loader/forge.svg)](https://modrinth.com/mod/cobweb-mod-template/versions?l=forge)![Separator](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/separator.svg)[![Fabric](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/loader/fabric.svg)](https://modrinth.com/mod/cobweb-mod-template/versions?l=fabric)

![Issues](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/github/issues.svg)[![GitHub](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/github/github.svg)](https://github.com/crystal-nest/cobweb-mod-template/issues)

---
## **Description**
Multiloader template for Minecraft mods!  
Built on [Jared's MultiLoaderTemplate](https://github.com/jaredlll08/MultiLoader-Template), with the addition of:

- Tasks to publish on GitHub, Modrinth, and CurseForge.
- [Cobweb](https://modrinth.com/mod/cobweb) API dependency.
- Some predefined gradle properties to quickly develop my own mods.
- A little bit more Javadoc.
- Code style changes.

## **How to use**
Steps to follow, in this order, to set up the project for a new mod:

- Replace across all project (CTRL+SHIFT+R) `Cobweb Mod Template` with the mod title.
- Replace across all project (CTRL+SHIFT+R) `cobweb-mod-template` with the mod id in kebab case.
- Replace across all project (CTRL+SHIFT+R) `cobweb_mod_template` with the mod id.
- Replace across all file/folder names `cobweb_mod_template` with the mod id.  
  Files that need to change:
  * `common/src/main/resources/cobweb_mod_template.mixins.json`
  * `fabric/src/main/resources/META-INF/services/crystalnest.cobweb_mod_template.platform.services.PlatformHelper`
  * `fabric/src/main/resources/cobweb_mod_template.fabric.mixins.json`
  * `forge/src/main/resources/META-INF/services/crystalnest.cobweb_mod_template.platform.services.PlatformHelper`
  * `forge/src/main/resources/cobweb_mod_template.fabric.mixins.json`
  * `neoforge/src/main/resources/META-INF/services/crystalnest.cobweb_mod_template.platform.services.PlatformHelper`
  * `neoforge/src/main/resources/cobweb_mod_template.fabric.mixins.json`

  Folders that need to change:
  * `common/src/main/java/cobweb_mod_template/`
  * `fabric/src/main/java/cobweb_mod_template/`
  * `forge/src/main/java/cobweb_mod_template/`
  * `neoforge/src/main/java/cobweb_mod_template/`
- In the `gradle.properties` file replace:
  * `mod_authors` with the proper authors
  * `description` with the proper description
  * `curseforge_id` with the actual CurseForge ID.
- Update `README.md` and `CHANGELOG.md`.

If you are not from the [Crystal Nest](https://github.com/crystal-nest), but still want to use this template, you are also required to do the following:

- Replace across all project (CTRL+SHIFT+R) `crystalnest` with your group.
- Replace across all file/folder names `crystalnest` with your group.  
  Files that need to change:
  * `fabric/src/main/resources/META-INF/services/crystalnest.cobweb_mod_template.platform.services.PlatformHelper`
  * `forge/src/main/resources/META-INF/services/crystalnest.cobweb_mod_template.platform.services.PlatformHelper`
  * `neoforge/src/main/resources/META-INF/services/crystalnest.cobweb_mod_template.platform.services.PlatformHelper`
  
  Folders that need to change:
  * `common/src/main/java/crystalnest/`
  * `fabric/src/main/java/crystalnest/`
  * `forge/src/main/java/crystalnest/`
  * `neoforge/src/main/java/crystalnest/`
- Delete the `.github/FUNDING.yml` file.
- Optionally change the license to your preferred one.

## **License and right of use**
Feel free to use this mod template for any mod, just be sure to give credit and possibly link [here](https://github.com/crystal-nest/cobweb-mod-template#readme).  
This project is published under the [GNU General Public License v3.0](https://github.com/crystal-nest/cobweb-mod-template/blob/master/LICENSE).

## **Support me**
[![Twitch](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/twitch/twitch64.png "Twitch")](https://www.twitch.tv/crystal_spider_)
[![Patreon](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/patreon/patreon64.png "Patreon")](https://www.patreon.com/crystalspider)
[![Ko-fi](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/kofi/kofi64.png "Ko-fi")](https://ko-fi.com/crystalspider)
[![GitHub](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/github/github64.png "My other projects")](https://github.com/crystal-nest)
[![Modrinth](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/modrinth/modrinth64.png "Modrinth")](https://modrinth.com/user/CrystalSpider)
[![Curseforge](https://raw.githubusercontent.com/crystal-nest/mod-fancy-assets/main/curseforge/curseforge64.png "Curseforge")](https://www.curseforge.com/members/crystal_spider_/projects)

[![Bisect Hosting](https://www.bisecthosting.com/partners/custom-banners/d559b544-474c-4109-b861-1b2e6ca6026a.webp "Bisect Hosting")](https://bisecthosting.com/crystalspider)
