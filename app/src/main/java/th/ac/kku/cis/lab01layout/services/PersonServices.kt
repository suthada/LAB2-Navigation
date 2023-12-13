package th.ac.kku.cis.lab01layout.services

import th.ac.kku.cis.lab01layout.Person
import th.ac.kku.cis.lab01layout.R

class PersonServices {
    var persons: List<Person> = listOf<Person>(
        Person("สุธาดา โสภาพ", "643450089-0", R.drawable.noey_avatar),
        Person("ประสิทธิชัย จันทร์สม", "643450079-3", R.drawable.ff_avatar),
        Person("ชาญณรงค์ แต่งเมือง", "643450069-6", R.drawable.jj_avatar),
        Person("กมล จันบุตรดี", "643450063-8", R.drawable.ake_avatar),
        Person("จักรพรรดิ์ อนุไพร", "643450065-4", R.drawable.dew_avatar),
        Person("เจษฎา ลีรัตน์", "643450067-0", R.drawable.p_avatar),
        Person("ณัฐกานต์ อินทรพานิชย์", "643450072-7", R.drawable.y_avatar),
        Person("ทัศนีย์ มลาตรี", " 643450075-1", R.drawable.tuk_avatar),
        Person("ธนาธิป เตชะ", "643450076-9", R.drawable.j_avatar),
        Person("ปรเมศวร์ สิทธิมงคล", "643450078-5", R.drawable.make_avatar),
        Person("พรธิตา ขานพล", "643450080-8", R.drawable.b_avatar),
        Person("พีระเดช โพธิ์หล้า", "643450082-4", R.drawable.preradet_avatar),
        Person("วิญญู พรมภิภักดิ์", "643450084-0", R.drawable.mu_avatar),
        Person("ศรสวรรค์ ไพรอนันต์", "643450085-8", R.drawable.bo_avatar),
        Person("ศรันย์ ซุ่นเส้ง", "643450086-6", R.drawable.m_avatar),
        Person("อภิทุน ดวงจันทร์คล้อย", "643450092-1", R.drawable.pon_avatar),
        Person("อมรรัตน์ มาระเหว", "643450094-7", R.drawable.to_avatar),
        Person("อรัญ ศรีสวัสดิ์", "643450095-5", R.drawable.pr_avatar),
        Person("กฤติยา สินโพธิ์", "643450320-4", R.drawable.kuk_avatar),
        Person("ก้องภพ ตาดี", " 643450321-2", R.drawable.md_avatar),
        Person("เกรียงศักดิ์ หมู่เมืองสอง", "643450322-0", R.drawable.st_avatar),
        Person("เจษฏา พบสมัย", "643450323-8", R.drawable.ba_avatar),
        Person("เทวารัณย์ ชัยกิจ", "643450324-6", R.drawable.run_avatar),
        Person("ธนบดี สวัสดี", "643450325-4", R.drawable.te_avatar),
        Person("นภัสสร ดวงจันทร์", "643450326-2", R.drawable.cr_avatar),
        Person("นภาปิลันธ์ ชาวชายโขง", "643450327-0", R.drawable.nat_avatar),
        Person("วรรณภา เบ้านาค", "643450330-1", R.drawable.n_avatar),
        Person("ศุภชัย แสนประสิทธิ์", "643450332-7", R.drawable.bb_avatar),
        Person("อฆพร ไร่ขาม", "643450334-3", R.drawable.mol_avatar),
        Person("กฤตวัฒน์ อินทรสิทธิ์", "643450644-8", R.drawable.kf_avatar),
        Person("ณัฐธิดา บุญพา", "643450647-2", R.drawable.jan_avatar),
        Person("รัตพงษ์ ปานเจริญ", "643450650-3", R.drawable.t_avatar),

        )
    public fun GetAllPersonData(): List<Person>{
        return persons
    }
    public fun GetPersonDataByID(id:String): Person{
        //search data by id
        return persons[0]
    }
}